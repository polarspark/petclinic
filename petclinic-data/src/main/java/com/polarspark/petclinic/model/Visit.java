package com.polarspark.petclinic.model;

import java.time.LocalDate;

/**
 * Description: Entity for a
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 **/
public class Visit {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
