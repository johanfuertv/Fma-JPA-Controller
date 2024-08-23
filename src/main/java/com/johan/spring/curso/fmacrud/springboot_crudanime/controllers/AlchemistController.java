package com.johan.spring.curso.fmacrud.springboot_crudanime.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Alchemist;
import com.johan.spring.curso.fmacrud.springboot_crudanime.services.AlchemistService;





@RestController
@RequestMapping("/alchemist")
public class AlchemistController {

    //I have to remember always how to inyect with autowired
    @Autowired
    private AlchemistService service;


    @GetMapping("/all")
    public List<Alchemist>List() {

        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Alchemist>findByid(@PathVariable Long id) {

        return service.findById(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Alchemist alchemist) {
        
        return ResponseEntity.ok(service.save(alchemist));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Alchemist alchemist){

        return ResponseEntity.ok(service.update(id, alchemist));
    }

    @DeleteMapping("/{id}")
        public String delete(@PathVariable Long id) {   
        service.deletebyId(id);
    return "El objeto con ID " + id + " ha sido eliminado exitosamente.";
}

    
}

