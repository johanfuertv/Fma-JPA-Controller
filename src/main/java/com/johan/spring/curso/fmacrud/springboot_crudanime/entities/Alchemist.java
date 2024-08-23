package com.johan.spring.curso.fmacrud.springboot_crudanime.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alchemist")
public class Alchemist {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private String state;
    private String Abilityalchemist;


    
    public Alchemist() {
    }

    public Alchemist(Long id, String name, String state, String abilityalchemist) {
        this.id = id;
        this.name = name;
        this.state = state;
        Abilityalchemist = abilityalchemist;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getAbilityalchemist() {
        return Abilityalchemist;
    }
    public void setAbilityalchemist(String abilityalchemist) {
        Abilityalchemist = abilityalchemist;
    }
}
