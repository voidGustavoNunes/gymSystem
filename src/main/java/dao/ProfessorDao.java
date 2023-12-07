/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Aulas;
import model.Exercicio;
import model.Pessoa;
import model.Professor;
import model.Turma;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class ProfessorDao extends GenericDao {

    public ProfessorDao() {
    }

    private List<Professor> pesquisar(String pesq, int tipo) {
        List<Professor> lista = new ArrayList();

        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Professor.class);

            // TABELAS
            Root tabela = consulta.from(Professor.class);

            //RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                case 1:
                    restricoes = builder.like(tabela.get("nome"), pesq + "%");
                    break;
                case 2:
                    restricoes = builder.like(tabela.get("cpf"), pesq + "%");
                    break;
                case 3:
                    restricoes = builder.like(tabela.get("numeroRegistro"), pesq + "%");
                    break;
                case 4:
                    Join<Aulas, Professor> aulasJoin = tabela.join("aulas");
                    restricoes = builder.like(aulasJoin.get("tipo"), pesq + "%");
                    break;
                case 5:
                    Join<Exercicio, Professor> exercicioJoin = tabela.join("atividades");
                    restricoes = builder.like(exercicioJoin.get("nome"), pesq + "%");
                    break;
            }

            consulta.where(restricoes);
            lista = sessao.createQuery(consulta).getResultList();
            sessao.getTransaction().commit();
            sessao.close();

        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        return lista;
    }

    private List<Professor> pesquisar() {
        //List<Cliente> lista = new ArrayList();

        //return lista;
        // TESTE
        return listar(Professor.class);
    }

    public List<Professor> pesquisarNome(String pesq) {
        return pesquisar(pesq, 1);
    }

    public List<Professor> pesquisarNome() {
        return pesquisar();
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
