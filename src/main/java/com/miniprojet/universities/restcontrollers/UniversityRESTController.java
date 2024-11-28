package com.miniprojet.universities.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.universities.entities.University;
import com.miniprojet.universities.service.UniversityService;


@RestController 
@RequestMapping("/api") 
@CrossOrigin 

public class UniversityRESTController {
	
	@Autowired
	UniversityService universityService;
	
	@RequestMapping(method = RequestMethod.GET) 
	public List<University> getAllUniversities() { 
		return universityService.getAllUniversities(); 
	} 
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public University getUniversityById(@PathVariable("id") Long id) {  
		return universityService.getUniversity(id); 
	} 
	
	@RequestMapping(method = RequestMethod.POST) 
	public University createUniversity(@RequestBody University university) { 
		return universityService.saveUniversity(university); 
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.PUT) 
	public University updateUniversity(@RequestBody University university) { 
		return universityService.updateUniversity(university); 
	} 
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
	public void deleteUniversity(@PathVariable("id") Long id) { 
		universityService.deleteUniversityById(id); 
	}
	@RequestMapping(value="/prodscat/{idDom}",method = RequestMethod.GET) 
	public List<University> getUniversitiesByDomId(@PathVariable("idDom") Long idDom) { 
		return universityService.findByDomaineIdDom(idDom); 
	} 
}
