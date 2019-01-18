package org.cardealership.controllers;

import org.cardealership.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all/{orderDirection}")
    public ModelAndView getAllCustomersOrdered(@PathVariable("orderDirection") String orderDirection) {
        return new ModelAndView("customers-list")
                .addObject("customers", this.customerService.getAll(orderDirection));
    }

    @GetMapping("/{id}")
    public ModelAndView getCustomerSpendings(@PathVariable("id") Integer id) {
        return new ModelAndView("customer-spendings")
                .addObject("customers", this.customerService.getCustomerSpendings(id));
    }

}
