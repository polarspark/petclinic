package com.polarspark.petclinic.services;

import com.polarspark.petclinic.model.Owner;
import com.polarspark.petclinic.model.Person;
import com.polarspark.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);
    Vet save(Vet vet);
    Set<Owner> findAll();

}
