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

public class Welcome extends JFrame {

	private static JButton button;
	private static JButton button2;
	private static JButton button3;
	private static JLabel userLabel;
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
		
		JLabel userLabel = new JLabel("Welcome!");
		userLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		userLabel.setForeground(DARK_YELLOW);
		userLabel.setBounds(140, 20, 375, 50);
		panel.add(userLabel);
		
		
		button = new JButton("Sign Up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button.getModel().isArmed()) {
					UserSignUp.main(null);
				}
			}
		});
		button.setBounds(140, 90, 120, 50);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setForeground(VERY_DARK_RED);
		button.setBackground(VERY_DARK_RED);
		panel.add(button);

		button2 = new JButton("Log in");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button2.getModel().isArmed()) {
					Login.main(null);
				}
			}
		});
		button2.setBounds(140, 140, 120, 50);
		button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button2.setForeground(VERY_DARK_RED);
		button2.setBackground(VERY_DARK_RED);
		panel.add(button2);

		button3 = new JButton("View Menu");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button3.getModel().isArmed()) {
					ShoppingMain.main(null);
				}
			}
		});
		button3.setBounds(140, 190, 120, 50);
		button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button3.setForeground(VERY_DARK_RED);
		button3.setBackground(VERY_DARK_RED);
		panel.add(button3);
		
		frame.setVisible(true);
		
}
}
