import com.shh.ioc.service.AccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceTest {
    @Test
    public void transfer() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.transfer(1, 2, 100);
    }

    @Test
    public void transfer2() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig3.class);
//        AccountService accountService = (AccountService) context.getBean("accountService");
//        accountService.transfer(1, 2, 100);
    }
}
