package example.config;

import example.beans.Person;
import example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Toyoto");
        return vehicle;
    }

    @Bean
    public Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Lucy");
        person.setVehicle(vehicle);
        return person;
    }


}
