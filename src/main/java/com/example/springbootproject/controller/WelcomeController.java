package com.example.springbootproject.controller;

import com.example.springbootproject.pojo.Person;
import com.example.springbootproject.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WelcomeController {
    @Autowired
    PersonService personService;

    @RequestMapping("/persons")
    public List<Person> getPersons(){
        return personService.getPersons();
    }
}
