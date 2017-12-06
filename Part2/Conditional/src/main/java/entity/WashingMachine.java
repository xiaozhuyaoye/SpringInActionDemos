package entity;
import config.ExistConditional;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(ExistConditional.class)
public class WashingMachine {

}
