package main;

import bean.BeanThree;
import bean.BeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
//@ComponentScans({
//        @ComponentScan(basePackages = "bean"),
//        @ComponentScan(basePackageClasses = {BeanOne.class})
//})
public class AppConfig {

    //Full Mode

    @Bean
    public BeanTwo btwo() {
        //interbean dependancies
        //satisfy interbean dependancies
        //manage lifecycle of bthree1 and bthree2

        //call below method to get bean and check the lifecycle
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