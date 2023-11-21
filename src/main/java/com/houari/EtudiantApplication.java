package com.houari;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.houari.entities.Etudiant;
import com.houari.repositories.EtudiantRepository;

@SpringBootApplication
public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}
	Faker faker = new Faker();
	@Bean
	CommandLineRunner start(EtudiantRepository etudiantRepository) {
			return args -> {
				for(int i=0;i<10;i++) {
					Etudiant e = Etudiant.builder()
								 .codeApogee((int) (Math.random()*9999))
								 .email(faker.name().firstName()+"@gmail.com")
								 .nomComplet(faker.name().fullName())
								 .Filiere(faker.letterify("???????"))
								 .build();
					
					etudiantRepository.save(e);
				}
				
				List<Etudiant> listes = etudiantRepository.findAll();
				
				for(Etudiant e:listes) {
					System.out.println("__________________________");
					System.out.println("Nom complet = "+e.getNomComplet());
					System.out.println("Code Apogee = "+e.getCodeApogee());
					System.out.println("Email = "+e.getEmail());
					System.out.println("Filiere = "+e.getFiliere());
					}
				
			};
	}

}
