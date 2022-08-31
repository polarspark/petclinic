package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Description:
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 *
 **/
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
    List<Owner> findAllByLastNameLike(String lastName);
}
