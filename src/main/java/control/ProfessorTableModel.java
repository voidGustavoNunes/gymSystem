/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Professor;

/**
 *
 * @author Gustavo
 */
public class ProfessorTableModel extends AbstractTableModel{

    List<Professor> lista = new ArrayList();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Professor pro = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                pro.getNome();
            case 1 ->
                pro.getCpf();
            case 2 ->
                pro.getNumeroRegistro();
            case 3 ->
                pro.getSituacao();
            case 4 ->
                pro.getTelefone();
            case 5 ->
                pro.getFoto();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Nome", "Cpf", "Numero de Registro", "Situacao", "Telefone", "Foto"};
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
