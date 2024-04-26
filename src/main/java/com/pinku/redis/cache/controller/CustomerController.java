package com.pinku.redis.cache.controller;

import com.pinku.redis.cache.model.Customer;
import com.pinku.redis.cache.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pinku on 9/23/2021.
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer/{id}")
    public Customer getCustomer(@PathVariable String id){
        return customerService.getCustomerById(id);
    }
}
