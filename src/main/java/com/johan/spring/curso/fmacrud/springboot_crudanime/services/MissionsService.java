package com.johan.spring.curso.fmacrud.springboot_crudanime.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Missions;


public interface MissionsService {

    List<Missions> findAll();
    Optional<Missions> findbyId(Long id);
    Optional<Missions> findbymissionName(String missionsName);
    List<Missions> findbyrangeDate(Date startDate, Date finishDate);
    Missions save(Missions missions);
    Optional<Missions> update(Long id,Missions missions);
    void delete(Long id);
}
