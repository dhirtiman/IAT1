// 22. Create a Frame for Student Registration containing all the fields Name,
// Age, Contact, Father's Name, Annual Income and a submit button.
// Perform field validations.

import java.awt.*;
import java.awt.event.*;

/*
import java.awt.*  for Frame , Label, TextField , Button
   Frame:  defines a window with title , border and buttons for closing and minimizing
   Label: displays a single line of text 
   TextField: allows user to enter a single line of text
   Button: creates a clickable button 
import java.awt.event.* for ActionListener , WindowAdapter
   ActionListener: interface for receiving action events( like button clicks)
   WindowAdapter: abstract class for receiving window events (likee closing the window) 

create a class that exteends Frame and implements ActionListender
add datamembers for TextField: name,age,contact,father,income , Button: submit and label: message
in the constructor do the following:
  call setTitle(name) to name the window
  call setSize(400,400) to set the size of the window
  call setLayout(new GridLayout(7,2,10,10))
    to set the layout of the window to a grid with 7 rows , 2 columns and 10 pixels of horizontal and vertical gap
  call add method for:
    each lable: Name,Age,Contact,Father's Name,Annual Income follower by corresponding text field constructor
	txtField = new TextField()
	add(txtField)

 call add method for submit button and message label: 
 btnSubmit = new Button("Submit")
 lblMessage = new Label("")

 add(btnSubmit)
 add(lblMessage)

 add action listener to the submit button:
 btnSubmit.addActionListenner(this)

 add window Listener to handle window closing event:

 addWinddowListener(new WindowAdapter() {
   public void windowClosing(WindowEvent we){
     dispose();
}})
	
setVisible(true) to display the window

*/

public class StudentRegistration extends Frame implements ActionListener {
	TextField txtName, txtAge, txtContact, txtFather, txtIncome;
	Button btnSubmit;
	Label lblMessage;

	public StudentRegistration() {

		setTitle("Student Registration Form");
		setSize(400, 400);
		setLayout(new GridLayout(7, 2, 10, 10));

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
		String name = txtName.getText(),
				age = txtAge.getText(),
				contact = txtContact.getText(),
				father = txtFather.getText(),
				income = txtIncome.getText();

		if (name.isEmpty() || father.isEmpty()) {
			lblMessage.setText("Name and Father's Name cannot be empty.");
			return;
		}
		try {
			int ageValue = Integer.parseInt(age);
			if (ageValue <= 0 || ageValue > 100) {
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
			if (incomeValue < 0) {
				lblMessage.setText("Income cannot be negative");
				return;
			}
		} catch (NumberFormatException ex) {

			lblMessage.setText("Income must be numeric.");
			return;
		}

		lblMessage.setText("Registration Successful!");
	}

	public static void main(String[] args) {
		new StudentRegistration();
	}
}