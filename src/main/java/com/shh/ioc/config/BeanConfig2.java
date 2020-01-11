package com.shh.ioc.config;

import com.shh.ioc.dao.AccountDao;
import com.shh.ioc.dao.impl.AccountDaoImpl;
import com.shh.ioc.service.AccountService;
import com.shh.ioc.service.impl.AccountServiceImpl;
import org.springframework.context.annotation.Bean;

//@Configuration
public class BeanConfig2 {
    @Bean
    public AccountService accountService(AccountDao accountDao) {
        return new AccountServiceImpl();
    }

    @Bean("accountDao")
    public AccountDao getAccountDao() {
        return new AccountDaoImpl();
    }
}
