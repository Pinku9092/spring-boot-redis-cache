package com.pinku.redis.cache.service;

import com.pinku.redis.cache.model.Customer;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by Pinku on 9/23/2021.
 */

@Service
@CacheConfig(cacheNames = {"Customer"})
public class CustomerService {

    @Cacheable(key = "#id")
    public Customer getCustomerById(String id){
        return new Customer("id"+id, "harish", "harish.kumar@gmail.com");
    }
}
