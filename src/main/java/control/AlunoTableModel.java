/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Aluno;

/**
 *
 * @author Gustavo
 */
public class AlunoTableModel extends AbstractTableModel{

    public AlunoTableModel() {
    }

     
    private List<Aluno> lista = new ArrayList();
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aluno item = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> item.getCpf();
            case 1 -> item.getNome();
            case 2 -> item.getId();
            case 3 -> item.getDiaVencimento();
            case 4 -> item.getTurmas();
            default -> "";
        };
         
    }
    
    
    @Override
    public String getColumnName(int columnIndex ) {
        String colunas[] = {"Cpf", "Nome", "ID", "Dia de Vencimento", "Turmas"};
        return colunas[columnIndex];
    }
    
    
    public void adicionar(Aluno aluno) {
        lista.add(aluno);
        fireTableRowsInserted( lista.size() - 1 , lista.size() - 1);
    }
    
    public void remover(int row) {
        lista.remove(row);
        fireTableRowsDeleted(lista.size() - 1 , lista.size() - 1);
    }
    
    public void removeAll() {
        lista.clear();
        fireTableRowsDeleted(lista.size() - 1 , lista.size() - 1);
    }
        
    public void setList(List<Aluno> novaLista) {
        lista = novaLista;
        fireTableRowsInserted( 0 , lista.size() - 1);
    }
    
    public List<Aluno> getList() {
        return lista;
    }
}
