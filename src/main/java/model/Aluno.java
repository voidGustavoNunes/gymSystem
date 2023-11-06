/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Gustavo
 */
@Entity
@PrimaryKeyJoinColumn(name="idAluno")
public class Aluno extends Pessoa{
    
    public Aluno(String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, String genero, String cidade, String observacao, Date dtCadastro, String senha) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha);
    }
    
    String profissao;
    int diaVencimento;
    boolean indicacao;
    String pessoaIndicacao;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public boolean isIndicacao() {
        return indicacao;
    }

    public void setIndicacao(boolean indicacao) {
        this.indicacao = indicacao;
    }

    public String getPessoaIndicacao() {
        return pessoaIndicacao;
    }

    public void setPessoaIndicacao(String pessoaIndicacao) {
        this.pessoaIndicacao = pessoaIndicacao;
    }
    
}
