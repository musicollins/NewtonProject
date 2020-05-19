package com.demiurgos.newtonproject.service;

import java.util.ArrayList;
import java.util.List;

import com.demiurgos.newtonproject.model.PersonModel;
import com.demiurgos.newtonproject.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    
	public List<PersonModel> getAll() {
		List<PersonModel> persons = new ArrayList<>();
        personRepository.findAll().forEach(persons::add);
        return persons;
	}

	public void addPerson(PersonModel person) {
        personRepository.save(person);
    }

	public PersonModel findById(Long id) {
        return personRepository.findById(id).get();
    }

	public void updatePerson(PersonModel person) {
        personRepository.save(person);
	}

	public void deletePerson(Long id) {
        personRepository.deleteById(id);
	}

	public PersonModel findByFirstname(String firstname) {
        return personRepository.findByFirstname(firstname);
	}

	public void clearRegister() {
        personRepository.deleteAll();
	}
    
}