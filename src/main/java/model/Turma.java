/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    
    @ManyToOne
    @JoinColumn(name = "idAula")
    private Aulas aulas;
    
    String horarios;
    
    @Column (name = "nomeTurma", nullable = false)
    String nome;

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
    
    

    
}
