package com.johan.spring.curso.fmacrud.springboot_crudanime.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johan.spring.curso.fmacrud.springboot_crudanime.services.HomunculusService;

@RestController
@RequestMapping("/homunculus")
public class HomunculusController {

    @Autowired
    HomunculusService service;


    
}
