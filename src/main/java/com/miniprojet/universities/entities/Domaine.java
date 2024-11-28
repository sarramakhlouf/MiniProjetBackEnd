package com.miniprojet.universities.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Domaine {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDom; 
	private String nomDom;
	
	@OneToMany(mappedBy = "domaine")
	@JsonIgnore  
	private List<University> universities;

	public Domaine() {}
	public Domaine(String nomDom, List<University> universities) {
		super();
		this.nomDom = nomDom;
		this.universities = universities;
	}
	public Long getIdDom() {
		return idDom;
	}

	public void setIdDom(Long idDom) {
		this.idDom = idDom;
	}

	public String getNomDom() {
		return nomDom;
	}

	public void setNomDom(String nomDom) {
		this.nomDom = nomDom;
	}

	public List<University> getUniversities() {
		return universities;
	}

	public void setUniversities(List<University> universities) {
		this.universities = universities;
	}
}
