package org.cardealership.repositories;

import org.cardealership.models.Customer;
import org.cardealership.models.CustomerSpendings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findAllByOrderByBirthDateAscIsYoungDriverAsc();

    List<Customer> findAllByOrderByBirthDateDescIsYoungDriverDesc();

    @Query("SELECT c.name AS name, COUNT(DISTINCT s.car_id) as carsCount, SUM(p.price) as spendings FROM Customer as c " +
            "JOIN sales s ON c.id = s.customer_id  " +
            "JOIN cars ca ON ca.id = s.car_id  " +
            "JOIN parts_cars pc ON pc.car_id = ca.id " +
            "JOIN parts p ON pc.part_id = p.id " +
            "WHERE c.id = :id " +
            "GROUP BY c.name")
    List<CustomerSpendings> getCustomerSpendings(@Param("id") Integer id);
}
