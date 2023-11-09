/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;

/**
 *
 * @author Gustavo
 */
public class GerenciadorDominio {

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
    }
    
}
