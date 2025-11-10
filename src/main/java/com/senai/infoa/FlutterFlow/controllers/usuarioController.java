package com.senai.infoa.FlutterFlow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.FlutterFlow.models.usuario;
import com.senai.infoa.FlutterFlow.services.usuarioService;

@RestController
@RequestMapping
public class usuarioController {

    @Autowired
    private usuarioService us;
    
    @PostMapping("/salvar")
    public usuario salvar(@RequestParam usuario usuario) {
        return us.salvar(usuario);
    }

    @PostMapping("/confirmar")
public ResponseEntity<String> cadastrarUsuario(
        @RequestParam String senha,
        @RequestParam String email
) {
    if (!senha.equals(senha)) {
        return ResponseEntity.badRequest().body("As senhas não coincidem!");
    }

    return ResponseEntity.ok("Usuário logado com sucesso!");
    }
}
