package com.johan.spring.curso.fmacrud.springboot_crudanime.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="homunculus")
public class Homunculus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String CapitalSin;
    private String abilityHom;


    
    public Homunculus() {
    }
    public Homunculus(Long id, String name, String capitalSin, String abilityHom) {
        this.id = id;
        this.name = name;
        CapitalSin = capitalSin;
        this.abilityHom = abilityHom;
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
    public String getCapitalSin() {
        return CapitalSin;
    }
    public void setCapitalSin(String capitalSin) {
        CapitalSin = capitalSin;
    }
    public String getAbilityHom() {
        return abilityHom;
    }
    public void setAbilityHom(String abilityHom) {
        this.abilityHom = abilityHom;
    }
}
