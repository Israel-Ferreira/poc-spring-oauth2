package com.ecquiti.pocspringoauth2.controllers;

import java.util.List;

import com.ecquiti.pocspringoauth2.dto.CarDTO;
import com.ecquiti.pocspringoauth2.models.Car;
import com.ecquiti.pocspringoauth2.services.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CarController implements CrudMethods<Car, CarDTO> {

    @Autowired
    private CarService carService;

    @Override
    public ResponseEntity<List<Car>> getAll() {
        var carros = carService.getAll();
        return ResponseEntity.ok(carros);
    }

    @Override
    public ResponseEntity<Car> getById(Long id) {
        var carro = carService.getById(id);
        return ResponseEntity.ok(carro);
    }

    @Override
    public ResponseEntity<Car> create(CarDTO dtoJ) {
        var carro = carService.createCar(dtoJ);
        return ResponseEntity.status(HttpStatus.CREATED).body(carro);
    }

    @Override
    public ResponseEntity<Car> update(Long id, CarDTO dtoJ) {
        var carroUpdate = this.carService.update(id, dtoJ);
        return ResponseEntity.ok(carroUpdate);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        
        return null;
    }
    
}
