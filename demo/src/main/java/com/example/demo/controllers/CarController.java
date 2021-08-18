package com.example.demo.controllers;

import com.example.demo.models.Car;
import com.example.demo.services.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {


    private final CarService carService;

    public CarController(CarService carService){
        this.carService = carService;
    }

    @GetMapping("/getAll")
    public List<Car> getCar(){
        return carService.getCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id){
        return carService.getCarById(id);

    }

    @PostMapping("/save")
    public Car saveNewCare(@RequestBody Car car){
        return carService.saveCar(car);
    }

    @PostMapping("/delete")
    public void deleteCar(@RequestBody Car car){
       carService.deleteCarById(car.getId());
    }

}
