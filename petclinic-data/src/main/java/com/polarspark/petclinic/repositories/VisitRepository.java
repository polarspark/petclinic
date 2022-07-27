package com.polarspark.petclinic.repositories;

import com.polarspark.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Description:
 *
 * @author paulh
 * @version 3.0
 * @since 3.0
 * **/
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
