package org.cardealership.contracts;

import org.cardealership.models.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> getAll(String orderDirection);
}
