package com.polarspark.petclinic.services;

import com.polarspark.petclinic.model.Owner;

import java.util.List;



public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);



}
