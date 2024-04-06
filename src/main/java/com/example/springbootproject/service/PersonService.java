package com.example.springbootproject.service;

import com.example.springbootproject.pojo.Person;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1,"Rohit", 30, "Male", parseDate("15-10-1993")));
        return personList;
    }

    public boolean updatePerson(){
        return true;
    }

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
