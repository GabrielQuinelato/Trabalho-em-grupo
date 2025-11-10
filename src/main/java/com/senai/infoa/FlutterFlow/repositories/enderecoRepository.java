package com.senai.infoa.FlutterFlow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.infoa.FlutterFlow.models.endereco;

@Repository
public interface enderecoRepository extends JpaRepository<endereco, Integer> {

    public endereco salvar(endereco endereco);
    
}
