import config.Config;
import entity.WashingMachine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
//@ContextConfiguration("classpath:config/application-context.xml")
public class TestMachine {
    @Autowired
    private WashingMachine washingMachine;

    @Test
    public void testNull(){
        washingMachine.show();
    }

}
