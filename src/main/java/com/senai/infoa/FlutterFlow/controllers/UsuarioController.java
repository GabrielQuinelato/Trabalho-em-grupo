package com.senai.infoa.FlutterFlow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.FlutterFlow.models.Usuario;
import com.senai.infoa.FlutterFlow.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService us;
    
    @PostMapping("/cadastroUsuario")
    public Usuario salvar(@RequestBody Usuario usuario) {
        return us.salvar(usuario);
    }

    @PostMapping("/login")
public ResponseEntity<String> cadastrarUsuario(
        @RequestParam String senha,
        @RequestParam String email
) {
    if (!senha.equals(senha)) {
        return ResponseEntity.badRequest().body("As senhas não coincidem!");
    }

    return ResponseEntity.ok("Usuário logado com sucesso!");
    }

    @PutMapping("/atualizar/{id}")
    public Usuario atualizar(@PathVariable Integer id, @RequestBody Usuario usuario) {
        return us.atualizar(usuario, id);
    }
}
