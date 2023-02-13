package org.cat.springbootdemo.controller;

import org.cat.springbootdemo.config.PersonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DemoController {

    @Autowired
    private PersonConfig personConfig;


    @GetMapping("print")
    public String print(){
        System.out.println(personConfig);
        return "Demo!  ";
    }

}
