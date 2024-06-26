package com.pinku.redis.cache.model;

import java.io.Serializable;

/**
 * Created by Pinku on 9/23/2021.
 */
public class Customer implements Serializable {

    private String id;
    private String name;
    private String email;

    public Customer(String id, String name, String email) {
               this.id = id;
               this.name = name;
               this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
