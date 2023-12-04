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
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class AulasDao extends GenericDao {

    public AulasDao() {
    }

    private List<Aulas> pesquisar(String pesq, int tipo) {
        List<Aulas> lista = new ArrayList();

        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // CRITERIA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Aulas.class);

            // TABELAS
            Root tabela = consulta.from(Aulas.class);

            //RESTRIÇÕES
            Predicate restricoes = null;
            switch (tipo) {
                case 1:
                    restricoes = builder.like(tabela.get("tipo"), pesq + "%");
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
        return listar(Aulas.class);
    }
    
    
    

    public List<Aulas> pesquisarNome(String pesq) {

        return pesquisar(pesq, 1);
    }



    private List<Aulas> pesquisar() {
        //List<Cliente> lista = new ArrayList();

        //return lista;
        // TESTE
        return listar(Aulas.class);
    }

    public List<Aulas> pesquisarNome() {
        return pesquisar();
    }

}
