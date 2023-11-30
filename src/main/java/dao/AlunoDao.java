/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Aluno;
import org.hibernate.HibernateException;

/**
 *
 * @author Gustavo
 */
public class AlunoDao extends GenericDao{

    public AlunoDao() {
    }
    
    private List<Aluno> pesquisar(String pesq, int tipo)  {        
        //List<Cliente> lista = new ArrayList();
        
        //return lista;
        
        // TESTE
        return listar(Aluno.class);
    }
    private List<Aluno> pesquisar()  {        
        //List<Cliente> lista = new ArrayList();
        
        //return lista;
        
        // TESTE
        return listar(Aluno.class);
    }
    
    public List<Aluno> pesquisarNome()  {        
        return pesquisar();
    }
    
    public List<Aluno> pesquisarNome(String pesq)  {        
        return pesquisar(pesq,1);
    }
    
    public List<Aluno> pesquisarCPF(String pesq)  {        
        return pesquisar(pesq,2);
    }
    
    public List<Aluno> pesquisarCodigo(String pesq)  {        
        return pesquisar(pesq,3);
    }
    
    public List<Aluno> pesquisarDiaVencimento(String pesq)  {        
        return pesquisar(pesq,4);
    }
    
    public List<Aluno> pesquisarTurmas(String pesq)  {        
        return pesquisar(pesq,5);
    }
    
}
