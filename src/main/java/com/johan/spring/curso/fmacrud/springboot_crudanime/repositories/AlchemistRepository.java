package com.johan.spring.curso.fmacrud.springboot_crudanime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johan.spring.curso.fmacrud.springboot_crudanime.entities.Alchemist;

@Repository
public interface AlchemistRepository extends JpaRepository<Alchemist,Long> {

}
