/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Gustavo
 */
@Entity
//@PrimaryKeyJoinColumn(name="idAluno")
public class Aluno extends Pessoa implements Serializable{


    
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name="Turma_Aluno",
              joinColumns={@JoinColumn(name="idAluno")},
              inverseJoinColumns={@JoinColumn(name="idTurma")}
               )
    private List<Turma> turmas = new ArrayList();
    
    @OneToMany(mappedBy = "chavePK.aluno", fetch = FetchType.LAZY)
    private List<AlunoProfessorExercicio> atividades;
    
    
    @Column (nullable = false)
    String profissao;
    
    @Column (nullable = false)
    int diaVencimento;
    
    @Column (nullable = false)
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

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<AlunoProfessorExercicio> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<AlunoProfessorExercicio> atividades) {
        this.atividades = atividades;
    }

    public Aluno(List<AlunoProfessorExercicio> atividades, String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, char genero, String cidade, String observacao, Date dtCadastro, String senha, byte[] foto) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha, foto);
        this.atividades = atividades;
        this.profissao = profissao;
        this.diaVencimento = diaVencimento;
        this.indicacao = indicacao;
        this.pessoaIndicacao = pessoaIndicacao;
    }

    public Aluno(List<AlunoProfessorExercicio> atividades, String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, char genero, String cidade, String observacao, Date dtCadastro, String senha, int id) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha, id);
        this.atividades = atividades;
        this.profissao = profissao;
        this.diaVencimento = diaVencimento;
        this.indicacao = indicacao;
        this.pessoaIndicacao = pessoaIndicacao;
    }

    public Aluno(List<AlunoProfessorExercicio> atividades, String profissao, int diaVencimento, boolean indicacao, String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, char genero, String cidade, String observacao, Date dtCadastro, String senha, byte[] foto) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha, foto);
        this.atividades = atividades;
        this.profissao = profissao;
        this.diaVencimento = diaVencimento;
        this.indicacao = indicacao;
    }

    public Aluno(List<AlunoProfessorExercicio> atividades, String profissao, int diaVencimento, boolean indicacao, String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, char genero, String cidade, String observacao, Date dtCadastro, String senha, int id) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha, id);
        this.atividades = atividades;
        this.profissao = profissao;
        this.diaVencimento = diaVencimento;
        this.indicacao = indicacao;
    }
    
    

    public Aluno() {
    }
    
    
}
