package com.example.demo.services;

import com.example.demo.models.Car;
import com.example.demo.repositry.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CarService {

    private final CarRepository carRepository;

    private CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void deleteCarById(Long id) {
    carRepository.deleteById(id);

    }

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(long id) {
       return carRepository.findById(id).orElse(null);
    }
}