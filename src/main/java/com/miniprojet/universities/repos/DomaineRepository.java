package com.miniprojet.universities.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.miniprojet.universities.entities.Domaine;

@RepositoryRestResource(path = "dom") 
@CrossOrigin("http://localhost:4200/")
public interface DomaineRepository extends JpaRepository<Domaine, Long> {

}
