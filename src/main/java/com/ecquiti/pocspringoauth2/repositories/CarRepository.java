package com.ecquiti.pocspringoauth2.repositories;

import com.ecquiti.pocspringoauth2.models.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
