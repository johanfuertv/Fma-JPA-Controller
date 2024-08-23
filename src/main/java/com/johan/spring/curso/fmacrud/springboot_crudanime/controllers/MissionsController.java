package com.johan.spring.curso.fmacrud.springboot_crudanime.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Missions;
import com.johan.spring.curso.fmacrud.springboot_crudanime.services.MissionsService;


@RestController
@RequestMapping("/missions")
public class MissionsController {

    @Autowired
    MissionsService service;

    @GetMapping("/all")
    public List<Missions>List() {

        return service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Missions>findByid(@PathVariable Long id) {

        return service.findbyId(id);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Missions missions) {
        
        return ResponseEntity.ok(service.save(missions));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Missions missions){

        return ResponseEntity.ok(service.update(id, missions));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        
        service.delete(id);

        return "El objeto con ID " + id + " ha sido eliminado exitosamente.";
    }

    @GetMapping("/Missionsname")
    public ResponseEntity<?> findBymissionName(@RequestParam String missionsName) {
        
        Optional<Missions> mission = service.findbymissionName(missionsName);

        if (mission.isPresent()) { //El metodo IsPresent es de Optional
            return ResponseEntity.ok(mission.get());
        } else{
            return ResponseEntity.status((HttpStatus.NOT_FOUND)).body(null);
        }
    }
    
    @GetMapping("/missions/date-range")
    public ResponseEntity<List<Missions>> findByRangeDate(@RequestParam Date startDate, @RequestParam Date finishDate) {
        List<Missions> missions = service.findbyrangeDate(startDate, finishDate);
        return ResponseEntity.ok(missions);
    }

    




    
}
