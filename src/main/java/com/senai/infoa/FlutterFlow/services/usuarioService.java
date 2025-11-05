package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.FlutterFlow.models.usuario;
import com.senai.infoa.FlutterFlow.repositories.usuarioRepository;

@Service
public class usuarioService {
    @Autowired    
    private usuarioRepository ur;
    public usuario salvar(usuario usuario) {
        return ur.save(usuario);
    }
}

//comentario//