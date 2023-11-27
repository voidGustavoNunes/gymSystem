/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Professor;

/**
 *
 * @author Gustavo
 */
public class ProfessorDao extends GenericDao {

    public ProfessorDao() {
    }

    private List<Professor> pesquisar(String pesq, int tipo) {
        //List<Cliente> lista = new ArrayList();

        //return lista;
        // TESTE
        return listar(Professor.class);
    }

    public List<Professor> pesquisarNome(String pesq) {
        return pesquisar(pesq, 1);
    }

    public List<Professor> pesquisarCPF(String pesq) {
        return pesquisar(pesq, 2);
    }

    public List<Professor> pesquisarNumeroRegistro(String pesq) {
        return pesquisar(pesq, 3);
    }

    public List<Professor> pesquisarPorAulas(String pesq) {
        return pesquisar(pesq, 4);
    }
    
    public List<Professor> pesquisarPorAtividades(String pesq) {
        return pesquisar(pesq, 5);
    }
}
