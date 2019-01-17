package org.cardealership.controllers;

import org.cardealership.contracts.ICarService;
import org.cardealership.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
    private ICarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars/{make}")
    public ModelAndView getCarsByMake(@PathVariable("make") String make) {
        return new ModelAndView("cars")
                .addObject("cars", this.carService.getByMake(make));
    }
}
