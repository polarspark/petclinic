package com.polarspark.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PetType {

    @Id
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
