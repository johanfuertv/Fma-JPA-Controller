package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Alchemist;
import com.johan.spring.curso.fmacrud.springboot_crudanime.repositories.AlchemistRepository;

@Service
public class AlchemistServiceImpl implements AlchemistService {

    @Autowired
    AlchemistRepository repository;
    @Override
    @Transactional
    public List<Alchemist> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Optional<Alchemist> findById(Long id) {
        
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Alchemist save(Alchemist alchemist) {
        
       return repository.save(alchemist);
    }

    @Override
    @Transactional
    public void deletebyId(Long id) {
        // Verifica si el objeto existe antes de eliminarlo
        if(repository.existsById(id)) {
            repository .deleteById(id);
        } else {
            throw new IllegalArgumentException("El objeto con ID " + id + " no existe.");
        }
    }


    @Override
    @Transactional
    public Optional<Alchemist> update(Long id, Alchemist newAlchemistData) {
        Optional<Alchemist> oldAlchemistData = repository.findById(id);
    
        if (oldAlchemistData.isPresent()) {
            Alchemist updatedAlchemistData = oldAlchemistData.get();
            updatedAlchemistData.setName(newAlchemistData.getName()); // Deberías usar los valores correctos aquí
            updatedAlchemistData.setState(newAlchemistData.getState()); // En lugar de 'null', usa 'newAlchemistData.getState()'
            updatedAlchemistData.setAbilityalchemist(newAlchemistData.getAbilityalchemist());
            repository.save(updatedAlchemistData);
            return Optional.of(updatedAlchemistData);
        }else{
            return Optional.empty(); // Usa Optional.empty() para indicar que no se encontró el Alchemist
        }
        
    }

}
