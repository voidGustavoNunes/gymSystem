/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.ConexaoHibernate;
import dao.GenericDao;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.Icon;
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
    public int inserirAluno(int id,String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Icon foto, Date dtCadastro, String senha) throws ClassNotFoundException, SQLException{
        Aluno aluno = new Aluno(id, profissao, diaVencimento, indicacao, pessoaIndicacao, nome, cpf, dtNascimento, endereco, telefone, bairro,  genero, cidade, observacao, FuncoesUteis.IconToBytes(foto), dtCadastro,  senha);
        
        genDao.inserir(aluno);
        System.out.println("\n\n Chegou Aqui");
        return aluno.getId();
    }
    
    
    public void inserirProfessor() throws ClassNotFoundException, SQLException{
    
        
        
    }
    
    public void inserirExercicio() throws ClassNotFoundException, SQLException{
    
        
    }
    
    
}
