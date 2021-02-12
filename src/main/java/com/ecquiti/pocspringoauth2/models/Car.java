package com.ecquiti.pocspringoauth2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecquiti.pocspringoauth2.dto.CarDTO;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data   
@Entity
@NoArgsConstructor
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String manufacturer;
    private Integer year;
    private Integer ports;

    public Car(CarDTO dto){
        this.model = dto.getModel();
        this.manufacturer = dto.getManufacturer();
        this.year = dto.getYear();
        this.ports = dto.getPorts();
    }

}
