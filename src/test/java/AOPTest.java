import com.shh.aop.Shop;
import com.shh.aop.AOPConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:aop.xml"})
@ContextConfiguration(classes = {AOPConfig.class})
public class AOPTest {
    @Autowired
    Shop coffeeShop;

    @Test
    public void saleTest() {
//        coffeeShop.sale("拿铁");
        coffeeShop.sale("");
    }
}
