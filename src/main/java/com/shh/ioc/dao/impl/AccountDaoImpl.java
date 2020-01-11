package com.shh.ioc.dao.impl;

import com.shh.ioc.dao.AccountDao;
import com.shh.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private Account account;

//    public Account getAccount() {
//        return account;
//    }

    public Account findAccountById(int id) {
        return account;
    }

    public void updateAccount(Account account) {
    }
}
