/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Gustavo
 */
@Entity
public class AlunoProfessorExercicio implements Serializable{
    int series;
    int repeticoes;
    
    
    @EmbeddedId
    private AlunoEProfessorEExercicioPK chavePK;

    public AlunoEProfessorEExercicioPK getChavePK() {
        return chavePK;
    }

    public void setChavePK(AlunoEProfessorEExercicioPK chavePK) {
        this.chavePK = chavePK;
    }
    
    
   
    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public AlunoProfessorExercicio(int series, int repeticoes, AlunoEProfessorEExercicioPK chavePK) {
        this.series = series;
        this.repeticoes = repeticoes;
        this.chavePK = chavePK;
    }

    public AlunoProfessorExercicio() {
    }
    
    
}
