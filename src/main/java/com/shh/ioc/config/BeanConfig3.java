package com.shh.ioc.config;

import com.shh.domain.Account;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("bean.xml")
@ComponentScan(basePackages = "com.shh")
public class BeanConfig3 {
    @Bean("account")
    public Account getAccount() {
        return new Account();
    }
}
