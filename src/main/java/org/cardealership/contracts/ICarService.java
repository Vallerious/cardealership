package org.cardealership.contracts;

import org.cardealership.models.Car;

import java.util.List;

public interface ICarService {

    List<Car> getByMake(String make);

    List<Car> getAllCarsWithParts();

}
