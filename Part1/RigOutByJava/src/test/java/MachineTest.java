import config.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import type.Machine;
import type.People;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class MachineTest {
    @Autowired
    private People people;
    @Autowired
    private Machine machine;

    @Test
    public void test1(){
        System.out.println("People is null:  " + (people == null));
        System.out.println("Machine is null:  " + (machine == null));
        people.work();
    }
}
