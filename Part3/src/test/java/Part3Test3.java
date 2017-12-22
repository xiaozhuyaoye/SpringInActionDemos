import config.Part3Config;
import entity.Machine;
import entity.People;
import entity.WashingMachine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Part3Config.class)
public class Part3Test3 {
    @Autowired
    private WashingMachine machine;

    @Test
    public void test1(){
        machine.work();
        People people = (People) machine;
        people.ask();
    }
}
