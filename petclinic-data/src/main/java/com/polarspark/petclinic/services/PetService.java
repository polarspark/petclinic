package com.polarspark.petclinic.services;

import com.polarspark.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

   Pet findByID(Long id);
   Pet save(Pet owner);
   Set<Pet> findAll();

}
