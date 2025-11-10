package com.senai.infoa.FlutterFlow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.FlutterFlow.models.endereco;
import com.senai.infoa.FlutterFlow.services.enderecoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping
public class enderecoController {

    @Autowired
    private enderecoService es;
    
    @PostMapping("/salvar")
    public endereco salvar(@RequestParam endereco endereco) {
        return es.salvar(endereco);
    }

    @PutMapping("/atualizar/{id}")
    public endereco atualizar(@PathVariable Integer id, @RequestBody endereco endereco) {
        return es.atualizar(endereco, id);
    }

    @GetMapping("/count")
    public Long contador() {
        return es.contador();
    }
}
