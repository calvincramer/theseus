package theseuslevelmaker;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

public class CustomRenderer extends DefaultTableCellRenderer {
    
    public CustomRenderer() {
        this.x = -1;
        this.y = -1;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        TableModel tableModel = table.getModel();

        l.setBackground((Color) tableModel.getValueAt(row, column));
        l.setText("");

        return l;
          
    }
    
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    private int x;
    private int y;
}