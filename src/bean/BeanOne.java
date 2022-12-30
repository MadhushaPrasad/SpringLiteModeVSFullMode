package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
    public BeanOne() {
        System.out.println("Bean One Instantiated");
    }

    //Lite Mode
    @Bean
    public BeanTwo btwo() {
        //interBean dependency innovation
        //interBean dependencies
        //not satisfy interBean dependency on light mode
        //means bthree1 and bthree2 are not inside application context
        //and no lifecycle management happens
        BeanThree bthree1 = bthree();
        BeanThree bthree2 = bthree();

        //check the lifecycle of bthree1 and bthree2
        System.out.println(bthree1);
        System.out.println(bthree2);

        return new BeanTwo();
    }

    @Bean
    public BeanThree bthree() {
        return new BeanThree();
    }
}
