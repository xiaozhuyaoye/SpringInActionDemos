import Config.Config;
import machine.Machine;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tag.Cloths;
import tag.Housework;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = Config.class)
@ContextConfiguration("classpath:MachineConfig.xml")
public class Test {
    @Autowired
    //@Qualifier("airConditioning")
    //@Qualifier("floor")
    @Housework
    @Cloths
    private Machine machine;

    @org.junit.Test
    public void testNull(){
        machine.work();
    }
}
