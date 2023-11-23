/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.AlunoDao;
import dao.ConexaoHibernate;
import dao.GenericDao;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import model.Aluno;
import model.AlunoProfessorExercicio;
import model.Exercicio;
import model.Professor;
import org.hibernate.HibernateException;

/**
 *
 * @author Gustavo
 */
public class GerenciadorDominio {

    private AlunoDao alunoDao;

    GenericDao genDao = new GenericDao();
    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
    }
    
    
    //COM FOTO, ID E PESSOA INDICACAO
    public int inserirAluno(int id,String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Icon foto, Date dtCadastro, String senha, String situacao)  throws HibernateException{
        Aluno aluno = new Aluno(id, profissao, diaVencimento, indicacao, pessoaIndicacao, nome, cpf, dtNascimento, endereco, telefone, bairro,  genero, cidade, observacao, FuncoesUteis.IconToBytes(foto), dtCadastro,  senha, situacao);
        
        genDao.inserir(aluno);
     
        
        return aluno.getId();
    }
    
    
    public int inserirProfessor(String situacao, String numeroRegistro, String horarios, boolean usuarioMaster, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Icon foto, Date dtCadastro, String senha, int id) throws HibernateException{
        Professor professor = new Professor(situacao ,numeroRegistro, horarios, usuarioMaster, nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, FuncoesUteis.IconToBytes(foto), dtCadastro, senha, id);
        
        genDao.inserir(professor);

        
        return professor.getId();
    }
    
    public int inserirExercicio(String nome, String funcao, int series, int repeticoesPorSerie, String idadeRecomendada, String tipo) throws HibernateException{

       Exercicio exercicio = new Exercicio(nome, funcao,  series,  repeticoesPorSerie,  idadeRecomendada,  tipo);
       
       genDao.inserir(exercicio);

       
       return exercicio.getId();
       
    }
    
    public void excluir(Object obj) throws HibernateException {                               
        genDao.excluir(obj);
        
    }
    
        
    public List<Aluno> pesquisarAluno(String pesq, int tipo) throws HibernateException {
        List<Aluno> lista = null;
        switch (tipo) {
            case 1: lista = alunoDao.pesquisarCPF(pesq); break;
            case 2: lista = alunoDao.pesquisarNome(pesq); break;
            case 3: lista = alunoDao.pesquisarCodigo(pesq); break;
            case 4: lista = alunoDao.pesquisarDiaVencimento(pesq); break;
            case 5: lista = alunoDao.pesquisarTurmas(pesq); break;

        }
        return lista;        
    }
}
