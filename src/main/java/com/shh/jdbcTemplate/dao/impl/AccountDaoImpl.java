package com.shh.jdbcTemplate.dao.impl;

import com.shh.domain.Account;
import com.shh.jdbcTemplate.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account getAccountByName(String name) {
        String sql = "select * from account where name = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Account>(Account.class), name).get(0);
    }

    public void updateAccount(Account account) {
        String sql = "update account set name = ?, money = ? where id = ?";
        jdbcTemplate.update(sql, account.getName(), account.getMoney(), account.getId());
    }
}
