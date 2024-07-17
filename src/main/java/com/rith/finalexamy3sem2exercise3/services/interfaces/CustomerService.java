package com.rith.finalexamy3sem2exercise3.services.interfaces;

import com.rith.finalexamy3sem2exercise3.api.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll() throws Exception;
    Customer getById(int id) throws Exception;
    void save(Customer customer) throws Exception;
    void update(Customer customer) throws Exception;


}
