package org.cardealership.repositories;

import org.cardealership.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    public List<Supplier> findAllByIsImporter(boolean isImporter);

}
