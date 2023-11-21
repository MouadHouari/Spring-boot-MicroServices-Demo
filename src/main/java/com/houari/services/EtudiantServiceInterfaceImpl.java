package com.houari.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houari.dto.EtudiantRequestDTO;
import com.houari.dto.EtudiantResponseDTO;
import com.houari.entities.Etudiant;
import com.houari.mapper.EtudiantInterfaceMap;
import com.houari.repositories.EtudiantRepository;

@Service
public class EtudiantServiceInterfaceImpl implements EtudiantServiceInterface {

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EtudiantInterfaceMap etudiantInterfaceMap;
	
	@Override
	public void add(EtudiantRequestDTO etudiantRequestDTO) {
		Etudiant e = new Etudiant();
		
		e = etudiantInterfaceMap.fromRequestDTO2Etudiant(etudiantRequestDTO);
		
		etudiantRepository.save(e);
	}

	//Get
	@Override
	public List<EtudiantResponseDTO> listerEtudiants() {
		
		List<Etudiant> liste = new ArrayList<Etudiant>();
		liste = etudiantRepository.findAll();
		
		List<EtudiantResponseDTO> l = new ArrayList<EtudiantResponseDTO>();
		
		for(Etudiant e:liste) {
			EtudiantResponseDTO res = new EtudiantResponseDTO();
			res=etudiantInterfaceMap.fromEtudiant2ResponseDTO(e);
			l.add(res);
		}
		return l;
	}

	@Override
	public EtudiantResponseDTO etudiantById(Integer id) {
		Etudiant e =etudiantRepository.findById(id).get();
		EtudiantResponseDTO r = etudiantInterfaceMap.fromEtudiant2ResponseDTO(e);
		
		return r;
		}

	@Override
	public void update(Integer id, EtudiantRequestDTO er) {
		Etudiant e =etudiantRepository.findById(id).get();
		if (er.getCodeApogee() !=null) e.setCodeApogee(er.getCodeApogee());
		if (er.getEmail() !=null) e.setEmail(er.getEmail());
		if (er.getFiliere() !=null) e.setFiliere(er.getFiliere());
		if (er.getNomComplet() !=null) e.setNomComplet(er.getNomComplet());
		
		etudiantRepository.save(e);
		
	}

	@Override
	public void delete(Integer id) {
		etudiantRepository.deleteById(id);
	}

}
