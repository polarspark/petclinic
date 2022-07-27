package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 **/
public interface VetRepository extends CrudRepository<Vet, Long> {
    Vet findByLastName(String lastName);

}
