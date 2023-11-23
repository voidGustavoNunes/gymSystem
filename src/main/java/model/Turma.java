/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gustavo
 */
@Entity
public class Turma implements Serializable{
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    int idTurma;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idAula")
    private Aulas aulas;
    
    String horarios;
    
    @Column (name = "nomeTurma", nullable = false)
    String nome;
    
    @ManyToMany (fetch = FetchType.LAZY)//TERMINAR
    @JoinTable(name="Turma_Aluno",
              joinColumns={@JoinColumn(name="idTurma")},
              inverseJoinColumns={@JoinColumn(name="idAluno")}
               )
    List<Aluno> alunos =new ArrayList();


    public int getIdTurma() {
        return idTurma;
    }

    public Aulas getAulas() {
        return aulas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public void setAulas(Aulas aulas) {
        this.aulas = aulas;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma() {
    }

    public Turma(int idTurma, Aulas aulas, String horarios, String nome) {
        this.idTurma = idTurma;
        this.aulas = aulas;
        this.horarios = horarios;
        this.nome = nome;
        
    }
    
    

    
}
