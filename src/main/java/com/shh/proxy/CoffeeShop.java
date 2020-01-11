package com.shh.proxy;

public class CoffeeShop implements Shop {
    public void sale(String name) {
        System.out.println("开始制作" + name + "......制作完成！");
    }
}
