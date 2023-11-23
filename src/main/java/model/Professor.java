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
//@PrimaryKeyJoinColumn(name="idProfessor")
public class Professor extends Pessoa implements Serializable{
    
    
    @Column (nullable = false)
    String situacao;
    
    @Column (nullable = false)
    int numeroRegistro;
    
    String horarios;
    
    boolean usuarioMaster;
    
    @ManyToMany (fetch = FetchType.LAZY)//TERMINAR
    @JoinTable(name="Professor_Aulas",
              joinColumns={@JoinColumn(name="idProfessor")},
              inverseJoinColumns={@JoinColumn(name="idAula")}
               )
    private List<Aulas> aulas = new ArrayList();
    
    
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

    public List<Aulas> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aulas> aulas) {
        this.aulas = aulas;
    }

    public List<AlunoProfessorExercicio> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<AlunoProfessorExercicio> atividades) {
        this.atividades = atividades;
    }

    public Professor() {
    }

    public Professor(String situacao, int numeroRegistro, String horarios, boolean usuarioMaster, List<AlunoProfessorExercicio> atividades, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Date dtCadastro, String senha, int id) {
        super(nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, dtCadastro, senha, id);
        this.situacao = situacao;
        this.numeroRegistro = numeroRegistro;
        this.horarios = horarios;
        this.usuarioMaster = usuarioMaster;
        this.atividades = atividades;
    }
    
    
    
}
