package com.shh.aop;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class CoffeeShop implements Shop {
    public void sale(String name) {
        if (!StringUtils.isEmpty(name)) {
            System.out.println("开始制作" + name + "......制作完成！");
        } else {
            System.out.println("制作过程中出错了！");
            throw new RuntimeException();
        }
    }
}
