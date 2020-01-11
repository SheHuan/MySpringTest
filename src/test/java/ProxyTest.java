import com.shh.proxy.*;
import org.junit.Test;

public class ProxyTest {
    @Test
    public void staticProxyTest() {
        Shop shop = new CoffeeShop();
        StaticProxy staticProxy = new StaticProxy(shop);
        staticProxy.sale("拿铁");
    }

    @Test
    public void jdkProxyTest() {
        Shop shop = new CoffeeShop();
        JdkProxy jdkProxy = new JdkProxy();
        Shop shopProxy = jdkProxy.createProxy(shop);
        shopProxy.sale("拿铁");
    }

    @Test
    public void cglibProxyTest() {
        CoffeeShop2 shop = new CoffeeShop2();
        CglibProxy cglibProxy = new CglibProxy();
        CoffeeShop2 shopProxy = (CoffeeShop2) cglibProxy.createProxy(shop);
        shopProxy.sale("拿铁");
    }
}
