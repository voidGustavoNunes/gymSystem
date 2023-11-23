/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDao;
import java.sql.SQLException;
import java.util.Date;
import model.Aluno;

/**
 *
 * @author Gustavo
 */
public class GerenciadorDominio {

    GenericDao genDao = new GenericDao();
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
    }
    
    //COM FOTO, ID E PESSOA INDICACAO
    public int inserirAluno(int id,String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, int cpf, Date dtNascimento, String endereco, int telefone, String bairro, char genero, String cidade, String observacao, byte[] foto, Date dtCadastro, String senha) throws ClassNotFoundException, SQLException{
        Aluno aluno = new Aluno(id, profissao, diaVencimento, indicacao, pessoaIndicacao, nome, cpf, dtNascimento, endereco, telefone, bairro,  genero, cidade, observacao,foto, dtCadastro,  senha);
        
        genDao.inserir(aluno);
        
        return aluno.getId();
    }
    
    
    public void inserirProfessor() throws ClassNotFoundException, SQLException{
    
        
        
    }
    
    public void inserirExercicio() throws ClassNotFoundException, SQLException{
    
        
    }
    
    
}
