package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 *

 * @author paulh
 * @version 3.0
 * @since 3.0
 **/
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {

   // Specialty findByName(String name);
}
