package com.demiurgos.newtonproject.controller;

import java.util.List;

import com.demiurgos.newtonproject.model.PersonModel;
import com.demiurgos.newtonproject.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET, value = "/all-persons")
    public List<PersonModel> persons(){
        return personService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add-person")
    public String addPerson(@RequestBody PersonModel person){
        personService.addPerson(person);
        return "person added";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find-person/{id}")
    public PersonModel findById(@PathVariable Long id){
        return personService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update-person/{id}")
    public String updatePerson(@PathVariable Long id, @RequestBody PersonModel person){
        personService.updatePerson(person);
        return "person updated";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete-person/{id}")
    public String deletePerson(@PathVariable Long id){
        personService.deletePerson(id);
        return "Person deleted";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find-by-name/{firstname}")
    public PersonModel findByFirstname(@PathVariable String firstname){
        return personService.findByFirstname(firstname);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/clear-all")
    public void clearRegister() {
        personService.clearRegister();
    }
}