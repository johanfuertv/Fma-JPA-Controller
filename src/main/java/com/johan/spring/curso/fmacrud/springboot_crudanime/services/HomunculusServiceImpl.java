package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Homunculus;
import com.johan.spring.curso.fmacrud.springboot_crudanime.repositories.HomunculusRepository;

@Service
public class HomunculusServiceImpl implements HomunculusService {

    @Autowired
    HomunculusRepository repository;
    @Override
    public List<Homunculus> findAll() {
       
        return repository.findAll();
    }


    @Override
    public Homunculus save(Homunculus homunculus) {
        
        return repository.save(homunculus);
    }

    @Override
    public Optional<Homunculus> findbyCapitalSin(String CapitalSin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findbyCapitalSin'");
    }

    @Override
    public void deletebyId(Homunculus homunculus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletebyId'");
    }

    @Override
    public Homunculus update(Long id, Homunculus homunculus) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Homunculus> findbyId(Long id) {
        
        return repository.findById(id);
    }

}
