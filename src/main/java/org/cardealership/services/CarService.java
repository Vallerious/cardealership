package org.cardealership.services;

import org.cardealership.contracts.ICarService;
import org.cardealership.models.Car;
import org.cardealership.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements ICarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getByMake(String make) {
        return this.carRepository.findAllByMakeOrderByModelAscTravelledDistanceDesc(make);
    }

    @Override
    public List<Car> getAllCarsWithParts() {
        return this.carRepository.findAll();
    }
}
