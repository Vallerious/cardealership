package org.cardealership.contracts;

import org.cardealership.models.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAllByIsImporter(boolean isImporter);

    List<Supplier> getAllByIsImporter(String importerType);
}
