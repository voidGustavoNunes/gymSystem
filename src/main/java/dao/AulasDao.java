/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.util.List;
import model.Aulas;


/**
 *
 * @author Gustavo
 */
public class AulasDao extends GenericDao {

    public AulasDao() {
    }
    
    private List<Aulas> pesquisar()  {        
        //List<Cliente> lista = new ArrayList();
        
        //return lista;
        
        // TESTE
        return listar(Aulas.class);
    }
    
    public List<Aulas> pesquisarNome()  {        
        return pesquisar();
    }
    

}
