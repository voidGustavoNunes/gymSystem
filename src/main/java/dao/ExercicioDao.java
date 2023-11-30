/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Exercicio;
import model.Turma;

/**
 *
 * @author Gustavo
 */
public class ExercicioDao extends GenericDao{

    public ExercicioDao() {
    }
       
        
    private List<Exercicio> pesquisar()  {        
        //List<Cliente> lista = new ArrayList();
        
        //return lista;
        
        // TESTE
        return listar(Exercicio.class);
    }

    
    public List<Exercicio> pesquisarNome()  {        
        return pesquisar();
    }
    
}
