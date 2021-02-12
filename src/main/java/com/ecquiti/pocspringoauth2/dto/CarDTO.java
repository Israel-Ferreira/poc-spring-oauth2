package com.ecquiti.pocspringoauth2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDTO {

    private String model;
    private String manufacturer;
    private Integer year;
    private Integer ports;
}
