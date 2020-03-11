package com.example.spiringbootdemo.web;

import com.example.spiringbootdemo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    private Person person;

    @GetMapping("/person")
    public String person(){
        return person.toString();
    }
}
