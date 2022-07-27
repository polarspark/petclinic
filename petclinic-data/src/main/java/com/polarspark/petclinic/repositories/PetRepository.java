package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 **/
public interface PetRepository extends CrudRepository<Pet, Long> {
    Pet findByName(String name);
}
