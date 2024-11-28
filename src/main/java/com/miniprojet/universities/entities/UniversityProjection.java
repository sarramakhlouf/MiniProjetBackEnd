package com.miniprojet.universities.entities;

import org.springframework.data.rest.core.config.Projection; 

@Projection(name = "nomUni", types = { University.class })
public interface UniversityProjection {
	public String getNomUni();
}
