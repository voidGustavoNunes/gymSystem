/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Aluno;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class AlunoDao extends GenericDao {

    public AlunoDao() {
    }

    private List<Aluno> pesquisar(String pesq, int tipo) {
        List<Aluno> lista = new ArrayList();
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Aluno.class);

            // TABELAS
            Root tabela = consulta.from(Aluno.class);

            //RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                // where nomeCliente LIKE 'pesq%'
                case 1:
                    restricoes = builder.like(tabela.get("nome"), pesq + "%");
                    break;
                case 2:
                    restricoes = builder.like(tabela.get("cpf"), pesq + "%");
                    break;
                case 3:
                    restricoes = builder.like(tabela.get("id"), pesq + "%");
                    break;
                case 4:
                    restricoes = builder.like(tabela.get("diaVencimento"), pesq + "%");
                    break;
                case 5:
                    restricoes = builder.like(tabela.get("turmas"), pesq + "%");
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
        return listar(Aluno.class);

    }

    private List<Aluno> pesquisar() {

        return listar(Aluno.class);
    }

    public List<Aluno> pesquisarNome() {
        return pesquisar();
    }

    public List<Aluno> pesquisarNome(String pesq) {
        return pesquisar(pesq, 1);
    }

    public List<Aluno> pesquisarCPF(String pesq) {
        return pesquisar(pesq, 2);
    }

    public List<Aluno> pesquisarCodigo(String pesq) {
        return pesquisar(pesq, 3);
    }

    public List<Aluno> pesquisarDiaVencimento(String pesq) {
        return pesquisar(pesq, 4);
    }

    public List<Aluno> pesquisarTurmas(String pesq) {
        return pesquisar(pesq, 5);
    }

}
