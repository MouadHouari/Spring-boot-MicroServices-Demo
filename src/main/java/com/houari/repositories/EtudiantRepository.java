package com.houari.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.houari.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

}
