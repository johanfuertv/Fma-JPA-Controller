package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Alchemist;


public interface AlchemistService {

    List<Alchemist> findAll();
    Optional<Alchemist> findById(Long id);
    Alchemist save(Alchemist alchemist);
    void deletebyId(Long id);
    Optional<Alchemist> update(Long id,Alchemist alchemist);
    
  
}
