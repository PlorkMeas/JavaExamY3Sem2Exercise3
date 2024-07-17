package com.rith.finalexamy3sem2exercise3.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "tbcustomer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;
    @Column(name = "customer_last_name")
    private String lastName;
    @Column(name = "customer_first_name")
    private String firstName;
    @Column(name = "customer_phone")
    private String phone;
}
