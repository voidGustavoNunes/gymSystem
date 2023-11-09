/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Gustavo
 */
@Entity
public class Exercicio implements Serializable {
    
    @Column (name = "nomeExercicio", nullable = false)
    String nome;
    
    String funcao;
    
    int idadeRecomendada;
    
    @OneToMany(mappedBy = "chavePK.exercicio", fetch = FetchType.LAZY)
    private List<AlunoProfessorExercicio> atividades;
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "idExercicio")
    int id;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getIdadeRecomendada() {
        return idadeRecomendada;
    }

    public void setIdadeRecomendada(int idadeRecomendada) {
        this.idadeRecomendada = idadeRecomendada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Exercicio() {
    }
    
    
}
