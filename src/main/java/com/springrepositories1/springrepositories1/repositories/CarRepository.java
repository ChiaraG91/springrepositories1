package com.springrepositories1.springrepositories1.repositories;

import com.springrepositories1.springrepositories1.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
