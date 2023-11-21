package com.houari.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder

public class EtudiantResponseDTO {

	private Integer id;	
	private Integer codeApogee;
	private String email;
	private String nomComplet;
	private String Filiere;
	
}
