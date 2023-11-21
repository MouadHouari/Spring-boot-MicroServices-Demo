package com.houari.mapper;

import com.houari.entities.Etudiant;

import org.springframework.stereotype.Component;

import com.houari.dto.*;

public interface EtudiantInterfaceMap {

	public Etudiant fromRequestDTO2Etudiant( EtudiantRequestDTO etudiantRequestDTO );
	
	public EtudiantResponseDTO fromEtudiant2ResponseDTO(Etudiant etudiant);
	
}
