package org.cardealership.contracts;

import org.cardealership.models.Customer;
import org.cardealership.models.CustomerSpendings;

import java.util.List;

public interface ICustomerService {
    public List<Customer> getAll(String orderDirection);

    List<CustomerSpendings> getCustomerSpendings(Integer customerId);
}
