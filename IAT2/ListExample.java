package IAT2;

import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.event.*;



public class ListExample extends JFrame implements ItemListener, ListSelectionListener {

    JComboBox<String> comboBox;
    JList<String> list;
    JLabel label;
    JTable table;
    

    ListExample() {

        String[] items = { "Java", "Python", "C++", "JavaScript" };

        comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 50, 120, 30);
        comboBox.addItemListener(e -> label.setText("Selected: " + comboBox.getSelectedItem()));

        list = new JList<>(items);
        list.setBounds(50, 100, 120, 80);
        list.addListSelectionListener(e -> label.setText("List: " + list.getSelectedValue()));

        label = new JLabel();
        label.setBounds(200, 100, 150, 30);
        String data[][]  = {{"1","Dhirtiman","22"},{"2","Khati","23"}};
        String columns[] = {"roll","name","age"};
        table = new JTable(data,columns);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(200,160,150,80);


        add(comboBox);
        add(list);
        add(label);
        add(sp);
        Vector<Integer> vt = new Vector<>(10,2);
        vt.addElement(null);
        vt.add(null);
        
        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ListExample();
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueChanged'");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}