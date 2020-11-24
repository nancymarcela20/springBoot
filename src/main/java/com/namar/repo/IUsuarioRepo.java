package com.namar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.namar.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{
	
	

}
