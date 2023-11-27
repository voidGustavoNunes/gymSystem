/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Professor;
import model.Turma;

/**
 *
 * @author Gustavo
 */
public class TurmaTableModel extends AbstractTableModel{
    List<Turma> lista = new ArrayList();

    public TurmaTableModel() {
    }
    
    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Turma turma = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 ->
                turma.getNome();
            case 1 ->
                turma.getIdTurma();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colunas[] = {"Nome", "id"};
        return colunas[columnIndex];
    }

    public void adicionar(Turma turma) {
        lista.add(turma);
        fireTableRowsInserted(lista.size() - 1, lista.size() - 1);
    }

    public Turma getTurma(int row) {
        return lista.get(row);
    }

    public void remover(int row) {
        lista.remove(row);
        fireTableRowsDeleted(lista.size() - 1, lista.size() - 1);
    }

    public void setList(List<Turma> novaLista) {
        lista = novaLista;
        fireTableRowsInserted(0, lista.size() - 1);
    }
}
