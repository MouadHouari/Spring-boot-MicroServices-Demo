package com.houari.services;

import java.util.List;
import com.houari.dto.EtudiantRequestDTO;
import com.houari.dto.EtudiantResponseDTO;

public interface EtudiantServiceInterface {

	//Post
	public void add(EtudiantRequestDTO etudiantRequestDTO);
	
	//Get
	public List<EtudiantResponseDTO> listerEtudiants();
	
	//GetById
	public EtudiantResponseDTO etudiantById(Integer id);
	
	//Put
	public void update(Integer id, EtudiantRequestDTO e);
	
	//Delete
	public void delete(Integer id);
	
}
