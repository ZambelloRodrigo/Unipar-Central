package com.mycompany.unipar.central.models;

import java.util.ArrayList;
import java.util.Date;

public class PessoaFisica extends Pessoa{
    private String nome;
    private String cpf;
    private String rg;
    private Date dataNascimento;

    public PessoaFisica() {
    }

    public PessoaFisica( String email, ArrayList<Endereco> listaEndereco, ArrayList<Telefone> listaTelefone,  String nome, String cpf, String rg, Date dataNascimento) {
        super( email, listaEndereco, listaTelefone);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
