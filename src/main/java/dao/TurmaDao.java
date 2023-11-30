/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Turma;

/**
 *
 * @author Gustavo
 */
public class TurmaDao extends GenericDao{

    public TurmaDao() {
    }
    
    
    private List<Turma> pesquisar()  {        
        //List<Cliente> lista = new ArrayList();
        
        //return lista;
        
        // TESTE
        return listar(Turma.class);
    }

    
    public List<Turma> pesquisarNome()  {        
        return pesquisar();
    }
}
