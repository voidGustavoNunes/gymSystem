/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Gustavo
 */
@Entity
@PrimaryKeyJoinColumn(name="idProfessor")
public class Professor extends Pessoa implements Serializable{
    
    
    @Column (nullable = false)
    String situacao;
    
    @Column (nullable = false)
    int numeroRegistro;
    
    String horarios;
    
    boolean usuarioMaster;
    
    @ManyToOne
    @JoinColumn(name = "idAula")
    private Aulas aula;
    
    
    @OneToMany(mappedBy = "chavePK.professor", fetch = FetchType.LAZY)
    private List<AlunoProfessorExercicio> atividades;
    
    
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public boolean isUsuarioMaster() {
        return usuarioMaster;
    }

    public void setUsuarioMaster(boolean usuarioMaster) {
        this.usuarioMaster = usuarioMaster;
    }

    public Professor() {
    }
    
    
    
}
