package com.example.demo.configuration;

import com.example.demo.models.Car;
import com.example.demo.repositry.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {

    @Bean
    CommandLineRunner commandLineRunner(CarRepository repo){
        return args ->{
           Car ford =  new Car(
            "Ford",
            "Mondeo",
            "Red",
            25000,
            250

            );
            repo.save(ford);
        };

    }

}
