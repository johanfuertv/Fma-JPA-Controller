package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Homunculus;


public interface HomunculusService {

    List<Homunculus> findAll();
    Optional<Homunculus> findbyId(Long id);
    Homunculus save(Homunculus homunculus);
    Optional<Homunculus> findbyCapitalSin(String CapitalSin);
    Homunculus update(Long id, Homunculus homunculus);
    void deletebyId (Homunculus homunculus);
}
