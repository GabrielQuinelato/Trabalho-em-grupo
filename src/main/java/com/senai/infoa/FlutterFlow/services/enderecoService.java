package com.senai.infoa.FlutterFlow.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.infoa.FlutterFlow.models.Endereco;
import com.senai.infoa.FlutterFlow.repositories.EnderecoRepository;

@Service
public class EnderecoService {

    @Autowired    
    private EnderecoRepository er;
    public Endereco salvar(String cep, String numero, String referencia) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setNumero(numero);
        endereco.setReferencia(referencia);
        return er.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
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
