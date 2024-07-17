package com.rith.finalexamy3sem2exercise3.api.controllers;

import com.rith.finalexamy3sem2exercise3.api.models.Customer;
import com.rith.finalexamy3sem2exercise3.services.interfaces.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;
    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() throws Exception{
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) throws Exception{
        return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<String> addCustomer(@RequestBody Customer customer) throws Exception{
        customerService.save(customer);
        return new ResponseEntity<>("Created Customer successfully", HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer, @PathVariable int id) throws Exception{
        customer.setId(id);
        customerService.update(customer);
        return new ResponseEntity<>("Updated Customer successfully", HttpStatus.CREATED);
    }
}
