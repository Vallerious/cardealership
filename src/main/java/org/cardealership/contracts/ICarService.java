package org.cardealership.contracts;

import org.cardealership.models.Car;

import java.util.List;

public interface ICarService {

    public List<Car> getByMake(String make);

}
