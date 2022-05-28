package edu.cuny.csi.csc330.Restaurant;

import java.util.Random;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ThankYou extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton button;
	private JFrame frame;

	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);

	Random random = new Random();

	// ImageIcon imagePayment = new ImageIcon("Payment.png");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThankYou frame = new ThankYou();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ThankYou() {

		char randomizedChar = (char) (random.nextInt(26) + 'A');
		int referenceNum = random.nextInt(111111, 999999);

		int orderNum = referenceNum + randomizedChar;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 600, 250);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(VERY_DARK_RED);
		setContentPane(panel);
		panel.setLayout(null);

		JLabel userLabel = new JLabel("Thank You for your order! ");

		userLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		userLabel.setForeground(DARK_YELLOW);
		userLabel.setBounds(130, 20, 375, 50);
		panel.add(userLabel);

		JLabel orderLabel = new JLabel("Your Order Number is: " + randomizedChar + orderNum + randomizedChar);
		orderLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		orderLabel.setForeground(DARK_YELLOW);
		orderLabel.setBounds(130, 60, 375, 50);
		panel.add(orderLabel);

		JLabel Label = new JLabel("Please Come Again!");
		Label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		Label.setForeground(DARK_YELLOW);
		Label.setBounds(130, 100, 375, 50);
		panel.add(Label);

	}

}
