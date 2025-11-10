package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.FlutterFlow.models.Usuario;
import com.senai.infoa.FlutterFlow.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired    
    private UsuarioRepository ur;
    public Usuario salvar(Usuario usuario) {
        return ur.save(usuario);
    }
}

//comentario//