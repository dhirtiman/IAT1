package IAT2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField display;
    String operator = "";
    double num1 = 0, num2 = 0;

    CalculatorGUI() {

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        String buttons[] = {
            "7","8","9","/",
            "4","5","6","*",
            "1","2","3","-",
            "0",".","=","+"
        };

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));

        for(String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel);

        setTitle("Calculator");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if("0123456789.".contains(cmd)) {
            display.setText(display.getText() + cmd);
        }
        else if("+-*/".contains(cmd)) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("");
        }
        else if(cmd.equals("=")) {

            num2 = Double.parseDouble(display.getText());
            double result = 0;

            switch(operator) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/": result = num1 / num2; break;
            }

            display.setText("" + result);
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}