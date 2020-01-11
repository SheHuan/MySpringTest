package com.shh.dbutils.dao.impl;

import com.shh.dbutils.ConnectionUtil;
import com.shh.dbutils.dao.IAccountDao;
import com.shh.domain.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;

@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Autowired
    private QueryRunner queryRunner;

    @Autowired
    private ConnectionUtil connectionUtil;

    public Account getAccountByName(String name) {
        String sql = "select * from account where name = ?";
        try {
            return queryRunner.query(connectionUtil.getConnection(), sql, new BeanHandler<Account>(Account.class), name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateAccount(Account account) {
        String sql = "update account set name = ?, money = ? where id = ?";
        try {
            queryRunner.update(connectionUtil.getConnection(), sql, account.getName(), account.getMoney(), account.getId());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
