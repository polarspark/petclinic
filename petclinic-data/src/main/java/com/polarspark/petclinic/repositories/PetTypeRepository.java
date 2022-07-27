package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 *
 **/

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
    PetType findByName(String name);
}
