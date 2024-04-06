package com.example.springbootproject.service;

import com.example.springbootproject.pojo.Person;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
        return personList;
    }

    public boolean updatePerson(){
        return true;
    }
}
