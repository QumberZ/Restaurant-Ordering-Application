package edu.cuny.csi.csc330.Restaurant;

import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	private static JTextField number;

	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		panel.setBounds(50, 50, 250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setBackground(VERY_DARK_RED);
		frame.add(panel);

		panel.setLayout(null);
		
		JLabel userLabel = new JLabel("Login");
		userLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		userLabel.setForeground(DARK_YELLOW);
		userLabel.setBounds(150, 22, 375, 50);
		panel.add(userLabel);

		userLabel = new JLabel("User Name");
		userLabel.setBounds(10, 80, 100, 25);
		userLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		userLabel.setForeground(DARK_YELLOW);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(100, 80, 165, 25);
		userText.setForeground(DARK_YELLOW);
		panel.add(userText);

		JLabel phoneNumber = new JLabel("Phone#");
		phoneNumber.setBounds(10, 110, 80, 25);
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
		phoneNumber.setForeground(DARK_YELLOW);
		panel.add(phoneNumber);

		number = new JTextField();
		number.setBounds(100, 110, 165, 25);
		number.setForeground(DARK_YELLOW);
		panel.add(number);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 140, 80, 25);
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordLabel.setForeground(DARK_YELLOW);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 140, 165, 25);
		passwordText.setForeground(DARK_YELLOW);
		panel.add(passwordText);

		button = new JButton("Login");
		button.setBounds(160, 170, 80, 50);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.addActionListener(new Login());
		button.setForeground(DARK_YELLOW);
		button.setBackground(DARK_YELLOW);
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 170, 300, 25);
		panel.add(success);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		String mobNumber = number.getText();
		System.out.println(user + ", " + mobNumber + "," + password);

		String msg = "" + userText;
		msg += " \n";

		try {
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/signlogin",
					"root", "register");

			PreparedStatement str = (PreparedStatement) connection.prepareStatement(
					"SELECT * FROM signlogin.account where user_name=? and mobile_number=? and password=?");

			str.setString(1, user);
			str.setString(2, mobNumber);
			str.setString(3, password);

			ResultSet rs = str.executeQuery();
			if (rs.next()) {
				JOptionPane.showMessageDialog(button, "Login successful!");
				ShoppingMain.main(null);
			} else {
				JOptionPane.showMessageDialog(button, "Incorrect Username, Number, or Password");
			}
		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}

	//// If for whatever reason the connection between the database is lost, this always works
		if (user.equals("failsafe") && password.equals("hello")) {
			JOptionPane.showMessageDialog(button, "Login successful");
			ShoppingMain.main(null);
		}
	}

}
