package com.shh.ioc.service.impl;

import com.shh.ioc.dao.AccountDao;
import com.shh.domain.Account;
import com.shh.ioc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
//    @Qualifier("accountDaoImpl")
    private AccountDao accountDao;

//    public void setAccountDao(AccountDao accountDao) {
//        this.accountDao = accountDao;
//    }

    public void transfer(int accountId1, int accountId2, float money) {
        // 1.查询转出账户
        Account account1 = accountDao.findAccountById(accountId1);
        // 2.查询转入账户
        Account account2 = accountDao.findAccountById(accountId2);
        // 3.转出账户减少钱
        account1.setMoney(account1.getMoney() - money);
        // 4.转入账户增加钱
        account2.setMoney(account2.getMoney() + money);
        // 5.更新转出账户
        accountDao.updateAccount(account1);
        // 6.更新转入账户
        accountDao.updateAccount(account2);
    }
}
