package org.cardealership.controllers;

import org.cardealership.contracts.ICarService;
import org.cardealership.models.Car;
import org.cardealership.models.Part;
import org.cardealership.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Set;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    private ICarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/{make}")
    public ModelAndView getCarsByMake(@PathVariable("make") String make) {
        return new ModelAndView("cars")
                .addObject("cars", this.carService.getByMake(make));
    }

    @GetMapping(value = "/parts")
    public ModelAndView getCarsWithTheirParts() {
        List<Car> cars = this.carService.getAllCarsWithParts();
        Set<Part> part = cars.get(0).getParts();
        return new ModelAndView("cars-and-parts")
                .addObject("cars", this.carService.getAllCarsWithParts());
    }
}
