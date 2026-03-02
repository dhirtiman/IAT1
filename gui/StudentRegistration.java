// 22. Create a Frame for Student Registration containing all the fields Name,
// Age, Contact, Father's Name, Annual Income and a submit button.
// Perform field validations.

import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends Frame implements ActionListener {
   TextField txtName,txtAge,txtContact,txtFather,txtIncome;
   Button btnSubmit;
   Label lblMessage;
   
   public StudentRegistration() {

	setTitle("Student Registration Form");
	setSize(400,400);
	setLayout(new GridLayout(7,2,10,10));

	add(new Label("Name:"));
	txtName = new TextField();
	add(txtName);

	add(new Label("Age:"));
	txtAge = new TextField();
	add(txtAge);

	add(new Label("Contact:"));
	txtContact = new TextField();
	add(txtContact);

	add(new Label("Father's Name:"));
	txtFather = new TextField();
	add(txtFather);

	
	add(new Label("Annual Income"));
	txtIncome = new TextField();
	add(txtIncome);

	btnSubmit = new Button("Submit");
	add(btnSubmit);

	lblMessage = new Label("");
	add(lblMessage);

	btnSubmit.addActionListener(this);

	addWindowListener(new WindowAdapter() {
	   public void windowClosing(WindowEvent we) {
		dispose();
	   }
	});

	setVisible(true);
   }

   public void actionPerformed(ActionEvent e) {
	String name = txtName.getText();
	String age = txtAge.getText();
	String contact = txtContact.getText();
	String father = txtFather.getText();
	String income = txtIncome.getText();

	if(name.isEmpty() || father.isEmpty()) {
	   lblMessage.setText("Name and Father's Name cannot be empty.");
	   return;
	}
	try {
	   int ageValue = Integer.parseInt(age);
	   if(ageValue <= 0 || ageValue > 100) {
		lblMessage.setText("Enter valid age (1-100).");
		return;
	   }
	} catch (NumberFormatException ex) {
		lblMessage.setText("Age must be numeric.");
		return;
	}
	if (!contact.matches("\\d{10}")) {
	   lblMessage.setText("Contact must be 10 digits.");
	   return;
	}

	try {
	   double incomeValue = Double.parseDouble(income);
	   if(incomeValue<0) {
		lblMessage.setText("Income cannot be negative");
	   	return;
	   }
	}catch(NumberFormatException ex) {
		
		lblMessage.setText("Income must be numeric.");
		return;
	   }

	   lblMessage.setText("Registration Succesfull!");
   }
   public static void main(String[] args) {
	new StudentRegistration();
   }
}