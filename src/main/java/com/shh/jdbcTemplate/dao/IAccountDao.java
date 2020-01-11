package com.shh.jdbcTemplate.dao;

import com.shh.domain.Account;

public interface IAccountDao {
    /**
     * 根据姓名查询账户
     *
     * @param name
     * @return
     */
    Account getAccountByName(String name);

    /**
     * 更新账户
     *
     * @param account
     */
    void updateAccount(Account account);
}
