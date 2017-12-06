import config.Config;
import entity.WashingMachine;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class Test {
    @Autowired
    private WashingMachine washingMachine;

    @org.junit.Test
    public void testNull(){
        System.out.println("washingMachine is null?  " + (washingMachine == null));
    }
}
