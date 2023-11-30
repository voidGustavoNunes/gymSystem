/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Aulas;
import model.Professor;

/**
 *
 * @author Gustavo
 */
public class ProfessorAlunoTableModel extends AbstractTableModel {

    public ProfessorAlunoTableModel() {
    }

    List<Professor> lista = new ArrayList();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Professor pro = lista.get(rowIndex);
        Aulas aulas = new Aulas();

        return switch (columnIndex) {
            case 0 ->
                aulas.getIdAula();
            case 1 ->
                pro.getId();
            case 2 ->
                pro.getNome();
            case 3 ->
                pro.getCpf();
            case 4 ->
                pro.getNumeroRegistro();
            case 5 ->
                pro.getSituacao();
            case 6 ->
                pro.getTelefone();
            case 7 ->
                pro.getFoto();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Id Aula", "Id Professor", "Nome", "Cpf", "Numero de Registro", "Situacao", "Telefone", "Foto"};
        return colunas[columnIndex];
    }

    public void adicionar(Professor pro) {
        lista.add(pro);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public Professor getProfessor(int row) {
        return lista.get(row);
    }

    public void remover(int row) {
        lista.remove(row);
        fireTableRowsDeleted(lista.size() - 1, lista.size() - 1);
    }

    public void setList(List<Professor> novaLista) {
        lista = novaLista;
        fireTableRowsInserted(0, lista.size() - 1);
    }
}
