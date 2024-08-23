package com.johan.spring.curso.fmacrud.springboot_crudanime.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Missions;

@Repository
public interface MissionsRepository extends JpaRepository<Missions,Long> {
    
    Optional<Missions> findByMissionName(String missionName);
     List<Missions> findByStartDateBetween(Date startDate, Date finishDate);
}
