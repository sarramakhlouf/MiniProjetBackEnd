package com.miniprojet.universities.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@RequestMapping(path="all", method = RequestMethod.GET) 
	public List<University> getAllUniversities() { 
		return universityService.getAllUniversities(); 
	} 
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("getbyid/{id}")
	public University getUniversityById(@PathVariable("id") Long id) {  
		return universityService.getUniversity(id); 
	} 
	
	@RequestMapping(value = "/adduni", method = RequestMethod.POST) 
	//@PostMapping("/adduni")
	@PreAuthorize("hasAuthority('ADMIN')")
	public University createUniversity(@RequestBody University university) { 
		return universityService.saveUniversity(university); 
	}
	
	@RequestMapping(value="/updateuni", method = RequestMethod.PUT) 
	//@PutMapping("/updateuni")
	public University updateUniversity(@RequestBody University university) { 
		return universityService.updateUniversity(university); 
	} 
	
	@RequestMapping(value="deluni/{id}",method = RequestMethod.DELETE) 
	//@DeleteMapping("deluni/{id}")
	public void deleteUniversity(@PathVariable("id") Long id) { 
		universityService.deleteUniversityById(id); 
	}
	@RequestMapping(value="/prodscat/{idDom}",method = RequestMethod.GET) 
	public List<University> getUniversitiesByDomId(@PathVariable("idDom") Long idDom) { 
		return universityService.findByDomaineIdDom(idDom); 
	} 
}
