package com.rith.finalexamy3sem2exercise3.services;

import com.rith.finalexamy3sem2exercise3.api.models.Customer;
import com.rith.finalexamy3sem2exercise3.repositories.CustomerRepository;
import com.rith.finalexamy3sem2exercise3.services.interfaces.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerImp implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public List<Customer> getAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(int id) throws Exception {
        return customerRepository.findById(id).orElseThrow(()-> new Exception("Customer id is not found"));
    }

    @Override
    public void save(Customer customer) throws Exception {
        customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) throws Exception {
        if(!customerRepository.existsById(customer.getId()))
            throw new Exception("Customer doesn't exist");
        customerRepository.save(customer);
    }
}
