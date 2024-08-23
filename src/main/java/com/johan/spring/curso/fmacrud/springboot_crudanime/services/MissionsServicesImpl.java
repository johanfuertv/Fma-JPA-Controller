package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Missions;
import com.johan.spring.curso.fmacrud.springboot_crudanime.repositories.MissionsRepository;

@Service
public class MissionsServicesImpl implements MissionsService {

    @Autowired
    MissionsRepository repository;
    @Override
    public void delete(Long id) {
        
        if (repository.existsById(id)) { //existById es una metodo que ayuda a saber si existe con el id
            repository.deleteById(id);
        }
        else{
            throw new IllegalArgumentException("El objeto con ID " + id + " no existe.");
        }
        
        
    }

    @Override
    public List<Missions> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Missions> findbyId(Long id) {
        return repository.findById(id);
    }


    /**
     * Busca una mision por su nombre. Si la encuentra, devuelve un Optional que contiene la mision.
     * De lo contrario, devuelve un Optional vacio.
     * @param missionsName El nombre de la mision que se busca.
     * @return Un Optional que contiene la mision si se encuentra, o bien un Optional vacio si no existe.
     */

    @Override
    public Optional<Missions> findbymissionName(String missionsName) {
        if (missionsName != null && missionsName.isEmpty()) {
            return repository.findByMissionName(missionsName);
        } else{
            return Optional.empty();
        }
    }

    @Override
    public List<Missions> findbyrangeDate(Date startDate, Date finishDate) {
        
        return repository.findByStartDateBetween(startDate, finishDate);
    }

    @Override
    public Missions save(Missions missions) {
        
        return repository.save(missions);
    }

   @Override
    @Transactional
    public Optional<Missions> update(Long id, Missions newMissionsData) {
        Optional<Missions> oldMissionData = repository.findById(id);
    
        if (oldMissionData.isPresent()) {
            Missions updatedMissionsData = oldMissionData.get();
            updatedMissionsData.setMissionName(newMissionsData.getMissionName()); // Deberías usar los valores correctos aquí
            repository.save(updatedMissionsData);
            return Optional.of(updatedMissionsData);
        }else{
            return Optional.empty(); // Usa Optional.empty() para indicar que no se encontró el Alchemist
        }
        
    }

}
