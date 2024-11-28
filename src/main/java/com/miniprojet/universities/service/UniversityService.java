package com.miniprojet.universities.service;

import java.util.List;

import com.miniprojet.universities.entities.Domaine;
import com.miniprojet.universities.entities.University;

public interface UniversityService {
	University updateUniversity(University u); 
	void deleteUniversity(University u); 
	void deleteUniversityById(Long id); 
	University getUniversity(Long id); 
	List<University> getAllUniversities();
	List<University> findByNomUni(String nomUni); 
	List<University> findByNomUniContains(String nomUni); 
	List<University> findByNomAdresse(String nomUni, String adresseUni); 
	List<University> findByDomaine(Domaine domaine); 
	List<University> findByDomaineIdDom(Long id); 
	List<University> findByOrderByNomUniAsc(); 
	List<University> trierUniversitiesNomAdresse();
	University saveUniversity(University university);

}
