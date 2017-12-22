import config.Part3Config;
import entity.Machine;
import entity.Printer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Part3Config.class)
public class Part3Test {
    @Autowired
    private Machine washingMachine;
    @Autowired
    private Printer printer;

    @Test
    public void test1(){
        washingMachine.work();
    }

    @Test
    public void test2(){
        printer.print("hello world .......");
    }
}

