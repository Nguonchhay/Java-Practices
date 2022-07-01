package screens;

import javax.swing.*;
import javax.swing.event.CellEditorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.util.EventObject;

public class UsersScreen extends JFrame {

    public UsersScreen() {
        super("Users");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        initUI();
    }

    public void initUI() {
        JPanel pContent = new JPanel();
        add(pContent);

        BoxLayout boxLayout = new BoxLayout(pContent, BoxLayout.Y_AXIS);
        pContent.setLayout(boxLayout);

        pContent.add(new JLabel("Users"));
        String[] userColumns = {"ID", "FullName", "Email", "Gender", " "};
        String[][] usersData = {
            {"1", "Hong Heng", "hongheng@gmail.com", "Male", " "},
            {"2", "Sok San", "soksan@gmail.com", "Male", " "},
            {"3", "Mey Long", "meylong@gmail.com", "Female", " "}
        };
        DefaultTableModel tableModelUser = new DefaultTableModel(usersData, userColumns);
        JTable tableUser = new JTable(tableModelUser);
        tableUser.setDefaultEditor(Object.class, null);

        tableUser.getColumn(" ").setCellRenderer(new UserTableRenderedAndEditor(tableUser));
        tableUser.getColumn(" ").setCellEditor(new UserTableRenderedAndEditor(tableUser));

        JScrollPane scrollPaneUser = new JScrollPane(tableUser);
        pContent.add(scrollPaneUser);
    }

    public void display() {
        super.setVisible(true);
    }

    class UserTableRenderedAndEditor implements TableCellRenderer, TableCellEditor {

        private JButton btnDelete;
        private int row;

        public UserTableRenderedAndEditor(JTable table) {
            btnDelete = new JButton("Delete");
            btnDelete.addActionListener(e -> {
                DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                tableModel.removeRow(row);
            });
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            return btnDelete;
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.row = row;
            return btnDelete;
        }

        @Override
        public Object getCellEditorValue() {
            return true;
        }

        @Override
        public boolean isCellEditable(EventObject anEvent) {
            return true;
        }

        @Override
        public boolean shouldSelectCell(EventObject anEvent) {
            return true;
        }

        @Override
        public boolean stopCellEditing() {
            return true;
        }

        @Override
        public void cancelCellEditing() {

        }

        @Override
        public void addCellEditorListener(CellEditorListener l) {

        }

        @Override
        public void removeCellEditorListener(CellEditorListener l) {

        }
    }
}


