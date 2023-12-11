/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Aulas;
import model.Turma;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class TurmaDao extends GenericDao {

    public TurmaDao() {
    }

    private List<Turma> pesquisar(String pesq, int tipo) {
        List<Turma> lista = new ArrayList();

        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Turma.class);

            // TABELAS
            Root tabela = consulta.from(Aulas.class);

            //RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                case 1:
                    restricoes = builder.like(tabela.get("nome"), pesq + "%");
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

    private Turma pesquisarObj(String pesq, int tipo) {
        Turma turmaEncontrada = null;

        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery<Turma> consulta = builder.createQuery(Turma.class);

            // TABELAS
            Root<Turma> tabela = consulta.from(Turma.class);

            // RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                case 1:
                    restricoes = builder.like(tabela.get("nome"), pesq + "%");
                    break;
            }

            consulta.select(tabela).where(restricoes);
            turmaEncontrada = sessao.createQuery(consulta).uniqueResult();
            sessao.getTransaction().commit();
            sessao.close();

        } catch (HibernateException erro) {
            if (sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        return turmaEncontrada;
    }

    public Turma pesquisarNome(String pesq) {
        return pesquisarObj(pesq, 1);
    }
    
}
