package com.miniprojet.universities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.miniprojet.universities.entities.Domaine;
import com.miniprojet.universities.entities.University;


@SpringBootApplication
public class UniversitiesApplication implements CommandLineRunner{
	
	@Autowired 
	private RepositoryRestConfiguration repositoryRestConfiguration; 

	public static void main(String[] args) {
		SpringApplication.run(UniversitiesApplication.class, args);
	}
	@Override 
	public void run(String... args) throws Exception { 
		repositoryRestConfiguration.exposeIdsFor(University.class,Domaine.class); 
	} 

}
