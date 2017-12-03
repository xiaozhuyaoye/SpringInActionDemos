import entity.XiaoMing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import type.Machine;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = config.ImportXMLToJavaConfig.class)
public class ImportXMLToJavaConfig {
    @Autowired
    private XiaoMing xiaoMing;
    @Autowired
    private Machine machine;

    @Test
    public void test1(){
        System.out.println("People is null:  " + (xiaoMing == null));
        System.out.println("Machine is null:  " + (machine == null));
        xiaoMing.work();
    }
}
