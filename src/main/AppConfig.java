package main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
//@ComponentScans({
//        @ComponentScan(basePackages = "bean"),
//        @ComponentScan(basePackageClasses = {BeanOne.class})
//})
public class AppConfig {

}