package edu.cuny.csi.csc330.Restaurant;

import java.awt.Image;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;

public class CheckoutCart extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JButton button;
	private JFrame frame;

	private JTextField fullname;
	private JPasswordField cardNumber;
	private JTextField expiration;
	private JPasswordField cvv;
	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);
	ImageIcon imagePayment = new ImageIcon("Payment.png");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckoutCart frame = new CheckoutCart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CheckoutCart() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 600, 497);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(VERY_DARK_RED);
		setContentPane(panel);
		panel.setLayout(null);

		JLabel userLabel = new JLabel("Payment");
		userLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		userLabel.setForeground(DARK_YELLOW);
		userLabel.setBounds(250, 22, 375, 50);
		panel.add(userLabel);

		JLabel nameLabel = new JLabel("Full Name");
		nameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		nameLabel.setForeground(DARK_YELLOW);
		nameLabel.setBounds(10, 80, 100, 35);
		panel.add(nameLabel);

		fullname = new JTextField();
		fullname.setFont(new Font("Tahoma", Font.PLAIN, 12));
		fullname.setBounds(90, 80, 165, 35);
		panel.add(fullname);
		fullname.setColumns(10);

		JLabel cardLabel = new JLabel("Card # ");
		cardLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cardLabel.setForeground(DARK_YELLOW);
		cardLabel.setBounds(10, 120, 100, 35);
		panel.add(cardLabel);

		cardNumber = new JPasswordField();
		cardNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cardNumber.setBounds(90, 120, 165, 35);
		panel.add(cardNumber);
		cardNumber.setColumns(10);

		JLabel exprLabel = new JLabel("Expiry Date ");
		exprLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		exprLabel.setForeground(DARK_YELLOW);
		exprLabel.setBounds(10, 160, 100, 35);
		panel.add(exprLabel);

		expiration = new JTextField();
		expiration.setFont(new Font("Tahoma", Font.PLAIN, 12));
		expiration.setBounds(90, 160, 165, 35);
		panel.add(expiration);
		expiration.setColumns(10);

		JLabel cvvLabel = new JLabel("CVV ");
		cvvLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		cvvLabel.setForeground(DARK_YELLOW);
		cvvLabel.setBounds(10, 200, 100, 35);
		panel.add(cvvLabel);

		cvv = new JPasswordField();
		cvv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cvv.setBounds(90, 200, 165, 35);
		panel.add(cvv);
		cvv.setColumns(10);

		ImageIcon image = new ImageIcon("Payment.png");
		image.setImage(image.getImage().getScaledInstance(370, 370, Image.SCALE_DEFAULT));
		JLabel pic = new JLabel(image);
		pic.setBounds(90, 300, 455, 95);
		panel.add(pic);

		button = new JButton("Confirm Pay");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fullName = fullname.getText();
				String cardnumber = cardNumber.getText();
				String expr = expiration.getText();
				String CVV = cvv.getText();
				int length = cardnumber.length();
				String msg = "" + fullName;
				msg += " \n";

				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payment", "root",
							"register");

					String query = "INSERT INTO cardInfo values('" + fullName + "','" + cardnumber + "','" + expr
							+ "','" + CVV + "')";

					Statement statement = connection.createStatement();

					if (length < 16) {
						JOptionPane.showMessageDialog(button,
								"INVALID, Please enter 16 valid digits of a credit/debit card");
					} else {
						JOptionPane.showMessageDialog(button, "Thank You! " + msg + "Your order has been placed!");
						ThankYou.main(null);
					}
					connection.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button.setBounds(400, 250, 140, 50);
		button.setBackground(DARK_YELLOW);
		button.setForeground(DARK_YELLOW);
		panel.add(button);
	}
}
