import com.shh.ioc.config.BeanConfig;
import com.shh.ioc.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
public class AccountServiceTest2 {
    @Autowired
    AccountService accountService;

    @Test
    public void transfer(){
        accountService.transfer(1, 2, 100);
    }
}
