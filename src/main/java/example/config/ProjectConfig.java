package example.config;

import example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {


    /*
    @Bean annotation, which lets Spring know that it needs to call
    this method when it initializes its context and adds the returned
    value to the context.
    * */
    @Bean(name="audiVehicle")
    Vehicle vehicle1() {
        var veh1 = new Vehicle();
        veh1.setName("Audi 8");
        return veh1;
    }

    @Bean(value="hondaVehicle")
    Vehicle vehicle2() {
        var veh2 = new Vehicle();
        veh2.setName("Honda");
        return veh2;
    }

    @Bean("ferrariVehicle")
    Vehicle vehicle3() {
        var veh3 = new Vehicle();
        veh3.setName("Enfield");
        return veh3;
    }




}
