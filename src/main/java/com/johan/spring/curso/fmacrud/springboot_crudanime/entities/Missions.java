package com.johan.spring.curso.fmacrud.springboot_crudanime.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="missions")
public class Missions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String missionName;
    private Date startDate;
    private Date finishDate;
    
    @ManyToOne
    Alchemist alchemist;

    @ManyToOne
    Homunculus homunculus;


    
    public Missions() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Alchemist getAlchemist() {
        return alchemist;
    }

    public void setAlchemist(Alchemist alchemist) {
        this.alchemist = alchemist;
    }

    public Homunculus getHomunculus() {
        return homunculus;
    }

    public void setHomunculus(Homunculus homunculus) {
        this.homunculus = homunculus;
    }
}
