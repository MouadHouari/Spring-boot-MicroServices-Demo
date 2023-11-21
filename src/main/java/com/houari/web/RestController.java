package com.houari.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.houari.dto.EtudiantRequestDTO;
import com.houari.dto.EtudiantResponseDTO;
import com.houari.services.EtudiantServiceInterface;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")

public class RestController {
	@Autowired
	EtudiantServiceInterface etudiantServiceInterface;

	
	
	@GetMapping("/etudiants")
	public List<EtudiantResponseDTO> getAll(){
		return etudiantServiceInterface.listerEtudiants();
	}
	
	@GetMapping("/etudiants/{id}")
	public EtudiantResponseDTO getId(@PathVariable Integer id){
		return etudiantServiceInterface.etudiantById(id);
	}
	
	@PostMapping("/etudiants")
	public void save(@RequestBody EtudiantRequestDTO c){
		
		etudiantServiceInterface.add(c);
		
	}
	
	@PutMapping("/etudiants/{id}")
	public void modify(@PathVariable Integer id, @RequestBody EtudiantRequestDTO c){
		
		etudiantServiceInterface.update(id, c);
	}
	
	@DeleteMapping("/etudiants/{id}")
	public void delete(@PathVariable Integer id) {
		etudiantServiceInterface.delete(id);
	}
}
