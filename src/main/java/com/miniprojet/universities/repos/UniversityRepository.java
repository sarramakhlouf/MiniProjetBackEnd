package com.miniprojet.universities.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.miniprojet.universities.entities.Domaine;
import com.miniprojet.universities.entities.University;

@RepositoryRestResource(path = "rest") 
public interface UniversityRepository extends JpaRepository<University, Long>{
	List<University> findByNomUni(String nom); 
	List<University> findByNomUniContains(String nom);
	List<University> findByDomaineIdDom(Long id); 
	List<University> findByOrderByNomUniAsc();
	
	@Query("select u from University u where u.nomUni like %:nom and u.numberEtudiants > :number") 
	List<University> findByNomAdresse(@Param("nomUni") String nom,@Param("adresseUni") String i);
	@Query("select u from University u where u.domaine = ?1") 
	List<University> findByDomaine(Domaine domaine); 
	@Query("select u from University u order by u.nomUni ASC, u.numberEtudiants DESC") 
	List<University> trierUniversitiesNomAdresse(); 
}
