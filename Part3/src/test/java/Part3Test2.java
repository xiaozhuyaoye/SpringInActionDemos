import entity.Printer;
import entity.WashingMachine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class Part3Test2 {
    @Autowired
    private WashingMachine washingMachine;
    @Autowired
    private Printer printer;

    @Test
    public void test1(){
        washingMachine.work();
    }

    @Test
    public void test2(){
        printer.print("emotions !");
    }
}
