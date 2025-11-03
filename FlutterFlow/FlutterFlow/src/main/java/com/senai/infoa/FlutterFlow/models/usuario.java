package com.senai.infoa.FlutterFlow.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")
public class usuario {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private Integer senha;

    @Column(name="confirmar_senha")
    private Integer confirmarSenha;

    @Column(name="nomeCompleto")
    private String nomeCompleto;

    @Column(name="cpf")
    private Integer cpf;

    @Column(name="dataNascimento")
    private LocalDate dataNascimento;

    public usuario () {}

    public usuario(Integer id, String email, Integer senha, Integer confirmarSenha , String nomeCompleto, Integer cpf, LocalDate dataNascimento ) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.confirmarSenha =confirmarSenha;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    public Integer getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(Integer confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getcpf() {
        return cpf;
    }

    public void setcpf(Integer cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
