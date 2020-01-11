package com.shh.jdbcTemplate.service.impl;

import com.shh.domain.Account;
import com.shh.jdbcTemplate.dao.IAccountDao;
import com.shh.jdbcTemplate.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
//@Transactional
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    public void transfer(String name1, String name2, float money) {
        // 1.查询转出账户
        Account account1 = accountDao.getAccountByName(name1);
        // 2.查询转入账户
        Account account2 = accountDao.getAccountByName(name2);
        // 3.转出账户减少钱
        account1.setMoney(account1.getMoney() - money);
        // 4.转入账户增加钱
        account2.setMoney(account2.getMoney() + money);
        // 5.更新转出账户
        accountDao.updateAccount(account1);
//        int s = 1/0;
        // 6.更新转入账户
        accountDao.updateAccount(account2);
    }
}
