import com.shh.jdbcTemplate.config.SpringConfig;
import com.shh.jdbcTemplate.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:jdbc-template.xml"})
@ContextConfiguration(classes = {SpringConfig.class})
public class JdbcTemplateTest {
    @Autowired
    private IAccountService accountService;

    @Test
    public void transfer() {
        accountService.transfer("张三", "李四", 100);
    }
}
