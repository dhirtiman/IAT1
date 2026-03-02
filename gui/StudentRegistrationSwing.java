import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationSwing extends JFrame implements ActionListener {
   private JTextField txtName,txtAge,txtContact,txtFather,txtIncome;
   private JButton btnSubmit;
   Label lblMessage;
   
   public StudentRegistrationSwing() {

	setTitle("Student Registration Form");
	setSize(450,350);

	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setLayout(new GridLayout(6,2,10,10));

	add(new JLabel("Name:"));
	txtName = new JTextField();
	add(txtName);

	add(new JLabel("Age:"));
	txtAge = new JTextField();
	add(txtAge);

	add(new JLabel("Contact:"));
	txtContact = new JTextField();
	add(txtContact);

	add(new JLabel("Father's Name:"));
	txtFather = new JTextField();
	add(txtFather);

	
	add(new JLabel("Annual Income"));
	txtIncome = new JTextField();
	add(txtIncome);

	btnSubmit = new JButton("Submit");
	add(new JLabel());
	add(btnSubmit);

	btnSubmit.addActionListener(this);

	setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e) {
	String name = txtName.getText().trim();
	String age = txtAge.getText().trim();
	String contact = txtContact.getText().trim();
	String father = txtFather.getText().trim();
	String income = txtIncome.getText().trim();

	if(name.isEmpty() || father.isEmpty()) {
	   JOptionPane.showMessageDialog(this,
		  "Name and Father's Name cannot be empty.",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   return;
	}
	try {
	   int ageValue = Integer.parseInt(age);
	   if(ageValue <= 0 || ageValue > 100) {
		JOptionPane.showMessageDialog(this,
		  "Enter valid age (1-100).",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   	return;
	   }
	} catch (NumberFormatException ex) {
		JOptionPane.showMessageDialog(this,
		  "Age must be numeric.",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   	return;
	}
	if (!contact.matches("\\d{10}")) {
	   JOptionPane.showMessageDialog(this,
		  "Contact must be 10 digits.",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   	return;
	}

	try {
	   double incomeValue = Double.parseDouble(income);
	   if(incomeValue<0) {
	   	 JOptionPane.showMessageDialog(this,
		  "Income cannot be negative",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   	return;
	   }
	}catch(NumberFormatException ex) {
		
		JOptionPane.showMessageDialog(this,
		  "Income must be numeric.",
		   "Error",
		   JOptionPane.ERROR_MESSAGE);
	   	return;
	   }

	   JOptionPane.showMessageDialog(this,
		  "Registration Succesfull!",
		   "Success",
		   JOptionPane.INFORMATION_MESSAGE);
   }
   public static void main(String[] args) {
	new StudentRegistrationSwing();
   }
}