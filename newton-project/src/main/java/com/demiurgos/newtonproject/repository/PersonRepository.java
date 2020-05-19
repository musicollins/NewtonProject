package com.demiurgos.newtonproject.repository;

import com.demiurgos.newtonproject.model.PersonModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<PersonModel, Long> {

	PersonModel findByFirstname(String firstname);
    
}