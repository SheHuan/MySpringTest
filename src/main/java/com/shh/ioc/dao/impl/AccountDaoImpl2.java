package com.shh.ioc.dao.impl;

import com.shh.ioc.dao.AccountDao;
import com.shh.domain.Account;

//@Primary
//@Repository
public class AccountDaoImpl2 implements AccountDao {
    public Account findAccountById(int id) {
        return new Account();
    }

    public void updateAccount(Account account) {
    }
}
