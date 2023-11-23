/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Gustavo
 */
public class GenericDao {

    public GenericDao() {
    }
    
    
    public void inserir(Object obj) throws HibernateException  {        
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();
            
            // OPERAÇÕES
            sessao.save(obj);
            
            sessao.getTransaction().commit();
            sessao.close();
        } catch ( HibernateException erro ) {
            if ( sessao != null) {
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);  
        }
    }
     
}
