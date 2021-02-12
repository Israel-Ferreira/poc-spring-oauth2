package com.ecquiti.pocspringoauth2.services;

import java.util.List;

import com.ecquiti.pocspringoauth2.dto.CarDTO;
import com.ecquiti.pocspringoauth2.exceptions.CarNotFoundException;
import com.ecquiti.pocspringoauth2.models.Car;
import com.ecquiti.pocspringoauth2.repositories.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRepository;

    public List<Car> getAll(){
        return carRepository.findAll();
    }

    public Car createCar(CarDTO newCar){
        Car car = new Car(newCar);
        return carRepository.save(car);
    }
    

    public Car getById(Long id){
        return carRepository.findById(id).orElseThrow(CarNotFoundException::new);
    }

    public Car update(Long id, CarDTO newCar){
        Car car = this.getById(id);
        
        car.setManufacturer(newCar.getManufacturer());
        car.setModel(newCar.getModel());
        car.setYear(newCar.getYear());
        car.setPorts(newCar.getPorts());

        return carRepository.save(car);
    }
}
