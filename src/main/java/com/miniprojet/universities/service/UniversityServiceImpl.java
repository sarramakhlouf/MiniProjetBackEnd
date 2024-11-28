package com.miniprojet.universities.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojet.universities.entities.Domaine;
import com.miniprojet.universities.entities.University;
import com.miniprojet.universities.repos.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService{
	
	@Autowired
	UniversityRepository universityRepository;

	@Override
    public University saveUniversity(University u) {
        return universityRepository.save(u);
    }
	
	@Override
	public University updateUniversity(University u) {
		return universityRepository.save(u);
	}

	@Override
	public void deleteUniversity(University u) {
		universityRepository.delete(u);
		
	}

	@Override
	public void deleteUniversityById(Long id) {
		universityRepository.deleteById(id);
		
	}

	@Override
	public University getUniversity(Long id) {
		return universityRepository.findById(id).get();
	}

	@Override
	public List<University> getAllUniversities() {
		return universityRepository.findAll()
;	}

	@Override
	public List<University> findByNomUni(String nomUni) {
		return universityRepository.findByNomUni(nomUni);
	}

	@Override
	public List<University> findByNomUniContains(String nomUni) {
		return universityRepository.findByNomUniContains(nomUni);
	}

	@Override
	public List<University> findByNomAdresse(String nomUni, String adresseUni) {
		return universityRepository.findByNomAdresse(nomUni,adresseUni);
	}

	@Override
	public List<University> findByDomaine(Domaine domaine) {
		return universityRepository.findByDomaine(domaine);
	}

	@Override
	public List<University> findByDomaineIdDom(Long id) {
		return universityRepository.findByDomaineIdDom(id);
	}

	@Override
	public List<University> findByOrderByNomUniAsc() {
		return universityRepository.findByOrderByNomUniAsc();
	}

	@Override
	public List<University> trierUniversitiesNomAdresse() {
		return universityRepository.trierUniversitiesNomAdresse();
	}
}
