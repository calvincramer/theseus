/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theseuslevelmaker;

import java.awt.Color;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Calvin
 */
public class ColorTableModel extends AbstractTableModel {
    private String[] columnNames;
    private Object[][] data;

    public ColorTableModel() {
        data = new Object[17][27];
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[0].length; x++) {
                data[y][x] = Color.WHITE;
            }
        }
        for (int x = 0; x < data[0].length; x++) {
            data[0][x] = Color.BLACK;
            data[data.length - 1][x] = Color.BLACK;
        }
        for (int y = 0; y < data.length; y++) {
            data[y][0] = Color.BLACK;
            data[y][data[0].length - 1] = Color.BLACK;
        }
        
        for (int y = 1; y < data.length; y += 2) {
            for (int x = 1; x < data[0].length; x += 2) {
                data[y][x] = new Color(200, 180, 160);
            }
        }
    }
    
    public int getColumnCount() {
        return 27;
    }

    public int getRowCount() {
        return data.length;
    }

    public String getColumnName(int col) {
        return "";
    }

    public Object getValueAt(int row, int col) {
        return data[row][col];
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * Don't need to implement this method unless your table's
     * data can change.
     */
    public void setValueAt(Object value, int row, int col) {
        if (getValueAt(row, col).equals(Color.BLACK) && col != 0 && col != data[0].length - 1 && row != 0 && row != data.length - 1) {
            data[row][col] = Color.WHITE;
        } else if (getValueAt(row, col).equals(Color.WHITE)) {
            data[row][col] = Color.BLACK;
        }
        
        
        
        fireTableCellUpdated(row, col);
    }

    @Override
    public String toString() {
        String s = "\"";
        for (int y = 1; y < data.length - 1; y +=2) {
            for (int x = 2; x < data[0].length - 2; x += 2) {
                if (data[y][x].equals(Color.BLACK)) s += "1";
                else s += "0";
            }
        }
        s += "\"→Str1";
        
        System.out.println(s);
        
        s = "\"";
        for (int y = 2; y < data.length - 1; y +=2) {
            for (int x = 1; x < data[0].length - 1; x += 2) {
                if (data[y][x].equals(Color.BLACK)) s += "1";
                else s += "0";
            }
        }
        s += "\"→Str2";
        
        System.out.println(s);
        System.out.println("");
        
        return "";
    }

}