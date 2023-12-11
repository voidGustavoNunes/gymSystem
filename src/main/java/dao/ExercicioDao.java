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
import model.Exercicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class ExercicioDao extends GenericDao{

    public ExercicioDao() {
    }
        
    private List<Exercicio> pesquisar(String pesq, int tipo) {
        List<Exercicio> lista = new ArrayList();
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Exercicio.class);

            // TABELAS
            Root tabela = consulta.from(Exercicio.class);

            //RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                // where nomeCliente LIKE 'pesq%'
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

    public List<Exercicio> pesquisar(){
        
        
        return listar(Exercicio.class);
    }
    
    public List<Exercicio> pesquisarNome(String pesq)  {        
        return pesquisar(pesq, 1);
    }
    
}
