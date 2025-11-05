package com.senai.infoa.FlutterFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.FlutterFlow.models.usuario;

@Repository
public interface usuarioRepository extends JpaRepository<usuario, Integer>{

}
