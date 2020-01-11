package com.shh.jdbcTemplate.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 测试全注解方式实现事务控制
 */
@Configuration
@ComponentScan("com.shh.jdbcTemplate")
@Import({JdbcConfig.class, TransactionConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
