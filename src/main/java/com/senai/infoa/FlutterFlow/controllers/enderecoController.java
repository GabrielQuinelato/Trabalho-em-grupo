package com.senai.infoa.FlutterFlow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.FlutterFlow.models.Endereco;
import com.senai.infoa.FlutterFlow.services.EnderecoService;


@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService es;
    
    @PostMapping("/salvarEndereco")
    public Endereco salvar(@RequestBody Endereco Endereco) {
        return es.salvar(Endereco);
    }

    @PutMapping("/atualizar/{id}")
    public Endereco atualizar(@PathVariable Integer id, @RequestBody Endereco Endereco) {
        return es.atualizar(Endereco, id);
    }

    @GetMapping("/buscar/{id}")
    public Endereco buscarPorId(@PathVariable Integer id) {
        return es.buscarPorId(id);
    }
}
