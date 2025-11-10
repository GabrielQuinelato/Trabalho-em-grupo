package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.FlutterFlow.models.Endereco;
import com.senai.infoa.FlutterFlow.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired    
    private EnderecoRepository er;
    public Endereco salvar(Endereco endereco) {
        return er.save(endereco);
    }

    public Endereco buscarPorId(Integer id) {
        return er.findById(id).get();
    }

    public Endereco atualizar(Endereco endereco, Integer id) {
        Endereco e = buscarPorId(id);
        if (e != null) {
            endereco.setId(id);
            return er.save(endereco);
        }
        return null;
    }

}
