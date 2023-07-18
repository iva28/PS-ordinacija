/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package form.model;

import domen.PlanIshrane;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Iva
 */
public class ModelTabelePlanoviIshrana extends AbstractTableModel{
    private String[] kolone = {"Id","Datum","Cena","Pacijent","Nutricionista","Broj dana"};
    private List<PlanIshrane> lista;
    private boolean menjanje = false;

    public ModelTabelePlanoviIshrana() {
        lista = new ArrayList<>();
    }

    public ModelTabelePlanoviIshrana(List<PlanIshrane> lista) {
        this.lista = lista;
    }

    public boolean isMenjanje() {
        return menjanje;
    }

    public void setMenjanje(boolean menjanje) {
        this.menjanje = menjanje;
    }
    
    
    

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public String getColumnName(int column) {
        if (column > kolone.length) return "n/a";
        return kolone[column];
    }

    public List<PlanIshrane> getLista() {
        return lista;
    }

    public void setLista(List<PlanIshrane> lista) {
        this.lista = lista;
    }
    
    public void postaviJedan(PlanIshrane plan) {
        lista = new ArrayList<>();
        lista.add(plan);
        fireTableDataChanged();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PlanIshrane p = lista.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> p.getPlanIshraneId();
            case 1 -> p.getDatum();
            case 2 -> p.getCena();
            case 3 -> p.getPacijent().getIme()+" "+p.getPacijent().getPrezime();
            case 4 -> p.getNutricionista().getIme()+" "+p.getNutricionista().getPrezime();
            case 5 -> p.getBrojDana();
            default -> "n/a";
        };
    }
    
    public PlanIshrane vratiPlan(int red) {
        return lista.get(red);
    }
}
