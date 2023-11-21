package com.houari.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.houari.dto.EtudiantRequestDTO;
import com.houari.dto.EtudiantResponseDTO;
import com.houari.entities.Etudiant;

@Component
public class EtudiantInterfaceMapImpl implements EtudiantInterfaceMap {

	@Override
	public Etudiant fromRequestDTO2Etudiant(EtudiantRequestDTO etudiantRequestDTO) {
		
		Etudiant e = new Etudiant();
		e.setCodeApogee(etudiantRequestDTO.getCodeApogee());
		e.setEmail(etudiantRequestDTO.getEmail());
		e.setFiliere(etudiantRequestDTO.getFiliere());
		e.setNomComplet(etudiantRequestDTO.getNomComplet());
		
		return e;
	}

	@Override
	public EtudiantResponseDTO fromEtudiant2ResponseDTO(Etudiant etudiant) {

		EtudiantResponseDTO e = new EtudiantResponseDTO();
		
		BeanUtils.copyProperties(etudiant, e);

		return e;
	}

}
