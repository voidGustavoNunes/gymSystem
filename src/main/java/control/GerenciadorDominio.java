/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.AlunoDao;
import dao.AulasDao;
import dao.ConexaoAjuda;
import dao.ConexaoHibernate;
import dao.ExercicioDao;
import dao.GenericDao;
import dao.ProfessorDao;
import dao.TurmaDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import model.Aluno;
import model.AlunoProfessorExercicio;
import model.Aulas;
import model.Exercicio;
import model.Professor;
import model.Turma;
import org.hibernate.HibernateException;

/**
 *
 * @author Gustavo
 */
public class GerenciadorDominio {

    private AlunoDao alunoDao;
    private ProfessorDao professorDao;
    private AulasDao aulasDao;
    private TurmaDao turmaDao;
    private ExercicioDao exDao;
    private ConexaoAjuda conAj;
    

    GenericDao genDao = new GenericDao();

    public GerenciadorDominio() {
        ConexaoHibernate.getSessionFactory();
        aulasDao = new AulasDao();
        professorDao = new ProfessorDao();
        alunoDao = new AlunoDao();
        turmaDao = new TurmaDao();
        exDao = new ExercicioDao();
        conAj = new ConexaoAjuda();
        genDao = new GenericDao();
    }

    public GenericDao getGenDao() {
        return genDao;
    }

    
    
    public int inserirAula(String tipo, int id) {
        Aulas aulas = new Aulas(tipo, id);

        genDao.inserir(aulas);

        return aulas.getIdAula();
    }

    public ConexaoAjuda getConAj() {
        return conAj;
    }
    
    public List listar(Class classe) throws HibernateException {        
        return genDao.listar(classe);
    }
    

    //COM FOTO, ID E PESSOA INDICACAO
    public int inserirAluno(int id, String profissao, int diaVencimento, boolean indicacao, String pessoaIndicacao, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Icon foto, Date dtCadastro, String senha, String situacao) throws HibernateException {
        Aluno aluno = new Aluno(id, profissao, diaVencimento, indicacao, pessoaIndicacao, nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, FuncoesUteis.IconToBytes(foto), dtCadastro, senha, situacao);

        genDao.inserir(aluno);

        return aluno.getId();
    }

    public int inserirProfessor(String situacao, String numeroRegistro, String horarios, boolean usuarioMaster, String nome, String cpf, Date dtNascimento, String endereco, String telefone, String bairro, char genero, String cidade, String observacao, Icon foto, Date dtCadastro, String senha, int id) throws HibernateException {
        Professor professor = new Professor(situacao, numeroRegistro, horarios, usuarioMaster, nome, cpf, dtNascimento, endereco, telefone, bairro, genero, cidade, observacao, FuncoesUteis.IconToBytes(foto), dtCadastro, senha, id);

        genDao.inserir(professor);

        return professor.getId();
    }

    public int inserirExercicio(String nome, String funcao, int series, int repeticoesPorSerie, String idadeRecomendada, String tipo) throws HibernateException {

        Exercicio exercicio = new Exercicio(nome, funcao, series, repeticoesPorSerie, idadeRecomendada, tipo);

        genDao.inserir(exercicio);

        return exercicio.getId();

    }

    public void excluir(Object obj) throws HibernateException {
        genDao.excluir(obj);

    }

    public List<Aluno> pesquisarAluno(String pesq, int tipo) throws HibernateException {
        List<Aluno> lista = null;
        switch (tipo) {
            case 1:
                lista = alunoDao.pesquisarCPF(pesq);
                break;
            case 2:
                lista = alunoDao.pesquisarNome(pesq);
                break;
            case 3:
                lista = alunoDao.pesquisarCodigo(pesq);
                break;
            case 4:
                lista = alunoDao.pesquisarDiaVencimento(pesq);
                break;
            case 5:
                lista = alunoDao.pesquisarTurmas(pesq);
                break;

        }
        return lista;
    }

    public List<Professor> pesquisarProfessor(String pesq, int tipo) throws HibernateException {
        List<Professor> lista = null;
        switch (tipo) {
            case 1:
                lista = professorDao.pesquisarCPF(pesq);
                break;
            case 2:
                lista = professorDao.pesquisarNome(pesq);
                break;
            case 3:
                lista = professorDao.pesquisarNumeroRegistro(pesq);
                break;
            case 4:
                lista = professorDao.pesquisarPorAulas(pesq);
                break;
            case 5:
                lista = professorDao.pesquisarPorAtividades(pesq);
                break;

        }
        return lista;

    }
    
    
    public List<Aulas> pesquisarAulas(String pesq, int tipo) throws HibernateException {
        List<Aulas> lista = null;
        switch (tipo) {
            case 1:
                lista = aulasDao.pesquisarNome(pesq);
                break;

        }
        return lista;

    }

    public List<Professor> pesquisarProfessor() throws HibernateException {
        List<Professor> lista = null;

        lista = professorDao.pesquisarNome();

        return lista;
    }

    public List<Aulas> pesquisarAulas() throws HibernateException {
        List<Aulas> lista = null;

        lista = aulasDao.pesquisarNome();

        return lista;
    }

    public List<Turma> pesquisarTurma() {
        List<Turma> lista = null;

        lista = turmaDao.pesquisarNome();

        return lista;

    }
    
    public List<Aluno> pesquisarAluno() {
        List<Aluno> lista = null;

        lista = alunoDao.pesquisarNome();

        return lista;

    }
    
    

    public void cadastrarAula() {

    }

    public List<Exercicio> pesquisarExercicio() {
        List<Exercicio> lista = null;
        
        lista = exDao.pesquisarNome();
         
        
        return lista;
        
    }

    public int inserirTurma(Aulas aulas, String horarios, String nome) {
        
        Turma turma = new Turma(aulas, horarios, nome);
        
        genDao.inserir(turma);
        
        return turma.getIdTurma();
    }

}
