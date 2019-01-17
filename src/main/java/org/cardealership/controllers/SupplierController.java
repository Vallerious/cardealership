package org.cardealership.controllers;

import org.cardealership.contracts.ISupplierService;
import org.cardealership.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SupplierController {
    private ISupplierService supplierService;

    @Autowired
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/suppliers/{importType}")
    public ModelAndView getSuppliersByImporterType(@PathVariable("importType") String importType) {
        return new ModelAndView("suppliers")
                .addObject("suppliers", this.supplierService.getAllByIsImporter(importType));
    }
}
