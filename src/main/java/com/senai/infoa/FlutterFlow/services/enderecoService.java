package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.FlutterFlow.models.endereco;
import com.senai.infoa.FlutterFlow.repositories.enderecoRepository;

@Service
public class enderecoService {

    @Autowired    
    private enderecoRepository er;
    public endereco salvar(endereco endereco) {
        return er.save(endereco);
    }

    public endereco buscarPorId(Integer id) {
        return er.findById(id).get();
    }

    public endereco atualizar(endereco endereco, Integer id) {
        endereco e = buscarPorId(id);
        if (e != null) {
            endereco.setId(id);
            return er.salvar(endereco);
        }
        return null;
    }

    public Long contador() {
        return er.count();
    }
}
