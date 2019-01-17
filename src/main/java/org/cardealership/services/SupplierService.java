package org.cardealership.services;

import org.cardealership.contracts.ISupplierService;
import org.cardealership.models.Supplier;
import org.cardealership.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {
    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllByIsImporter(boolean isImporter) {
        return this.supplierRepository.findAllByIsImporter(isImporter);
    }

    @Override
    public List<Supplier> getAllByIsImporter(String importerType) {
        return this.getAllByIsImporter(importerType.equals("importers"));
    }
}
