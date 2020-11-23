package com.namar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namar.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{
	
	

}
