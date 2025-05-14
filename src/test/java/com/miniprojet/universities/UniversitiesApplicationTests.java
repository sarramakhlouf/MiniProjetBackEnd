package com.miniprojet.universities;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.miniprojet.universities.entities.Domaine;
import com.miniprojet.universities.entities.University;
import com.miniprojet.universities.repos.UniversityRepository;

@SpringBootTest
class UniversitiesApplicationTests {

	@Autowired 
	private UniversityRepository universityRepository; 
	@Test 
	public void testCreateUniversity() { 
		University uni = new University("iset","nabeul",1500,new Date(), "isetn@gmail.com"); 
		universityRepository.save(uni); 
	}
	@Test 
	public void testFindUniversity() { 
		University u = universityRepository.findById(1L).get();     
		System.out.println(u); 
	} 
	@Test 
	public void testUpdateUniversity() { 
		University u = universityRepository.findById(1L).get(); 
		u.setNomUni("fatma"); 
		universityRepository.save(u); 
	} 
	@Test 
	public void testDeleteUniversity() { 
		universityRepository.deleteById(1L);;   
	}    
	@Test 
	public void testListerTousUniversities(){ 
	  List<University>  unis = universityRepository.findAll();   
	  for (University u : unis){ 
	    System.out.println(u); 
	  }   
	}
	 @Test 
	 public void testFindByNomUni() { 
		 List<University>  unis = universityRepository.findByNomUni("sarra"); 
		 for (University u : unis) { 
			 System.out.println(u); 
		 }  
	 }
	 @Test 
	 public void testFindByNomUniContains () { 
		 List<University> unis=universityRepository.findByNomUniContains("sara"); 
		 for (University u : unis) { 
		 System.out.println(u); 
		 } 
	 } 
	 @Test 
	 public void testfindByNomUniNumberEtudiants() { 
		 List<University>  unis = universityRepository.findByNomAdresse("sarra", "nabeul"); 
		 for (University u : unis) { 
			 System.out.println(u); 
		 } 
	 }
	 @Test 
	 public void testfindByDomaine() { 
		 Domaine dom = new Domaine(); 
		 dom.setIdDom(1L);    
		 List<University>  unis = universityRepository.findByDomaine(dom); 
		 for (University u : unis) { 
			 System.out.println(u); 
		 } 
	 } 
	 @Test
	 public void findByDomaineIdDom() {    
		 List<University>  unis = universityRepository.findByDomaineIdDom(1L); 
		 for (University u : unis) { 
			 System.out.println(u); 
		 } 
	 } 
	 @Test 
	 public void testfindByOrderByNomUnitAsc() { 
		  List<University>  unis = universityRepository.findByOrderByNomUniAsc();   
		  for (University u : unis) { 
			   System.out.println(u); 
		  } 
	 } 
	 @Test 
	 public void trierUniversitiesNomUniNumberEtudiantsr() { 
		 List<University>  unis = universityRepository.trierUniversitiesNomAdresse();
		 for (University u : unis) { 
		    System.out.println(u); 
		 } 
	 }

}
