package com.shh.ioc.dao;

import com.shh.domain.Account;

public interface AccountDao{
    Account findAccountById(int id);

    void updateAccount(Account account);
}
