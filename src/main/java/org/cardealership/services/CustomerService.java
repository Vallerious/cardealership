package org.cardealership.services;

import org.cardealership.contracts.ICustomerService;
import org.cardealership.models.Customer;
import org.cardealership.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll(String orderDirection) {
        return orderDirection.equals("ascending") ?
                this.customerRepository.findAllByOrderByBirthDateAscIsYoungDriverAsc():
                this.customerRepository.findAllByOrderByBirthDateDescIsYoungDriverDesc();
    }
}
