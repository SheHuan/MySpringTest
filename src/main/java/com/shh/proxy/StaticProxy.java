package com.shh.proxy;

public class StaticProxy implements Shop {
    private Shop shop;

    public StaticProxy(Shop shop) {
        this.shop = shop;
    }

    public void sale(String name) {
        System.out.println("欢迎！");
        shop.sale(name);
        System.out.println("再见！");
    }
}
