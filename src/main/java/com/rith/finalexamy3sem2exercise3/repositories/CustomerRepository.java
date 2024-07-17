package com.rith.finalexamy3sem2exercise3.repositories;

import com.rith.finalexamy3sem2exercise3.api.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
