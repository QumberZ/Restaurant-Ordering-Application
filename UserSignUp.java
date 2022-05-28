package edu.cuny.csi.csc330.Restaurant;

import java.awt.Image;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

public class UserSignUp extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField phoneNum;
	private JPasswordField passwordField;
	private JButton button;
	private JFrame frame;
	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);
	private BufferedImage image;

	ImageIcon imagePopeyes = new ImageIcon("Popeyes.png");
	ImageIcon imagePopeyes2 = new ImageIcon("Popeyes1.png");
	ImageIcon imagePopeyes3 = new ImageIcon("Popeyes3.png");
	ImageIcon imagePopeyes4 = new ImageIcon("Popeyes4.jpeg");

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSignUp frame = new UserSignUp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	

	public UserSignUp() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 190, 1014, 597);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(VERY_DARK_RED);
		setContentPane(panel);
		panel.setLayout(null);

		try {
			JFrame f = new JFrame("https://i.pinimg.com/originals/bf/fd/bb/bffdbb41d7b1ec6a3e46ef2d6bd1fa3b.png");

			panel.setBounds(50, 50, 250, 250);
			BufferedImage img = ImageIO
					.read(new File("https://i.pinimg.com/originals/bf/fd/bb/bffdbb41d7b1ec6a3e46ef2d6bd1fa3b.png"));
			JLabel pic = new JLabel(new ImageIcon(img));
			panel.add(pic);
			f.add(panel);
			f.setSize(400, 400);
			f.setLayout(null);
			f.setVisible(true);
		} catch (IOException e) {
		}
		
		Catalog list = new Catalog("Popeyes Menu");

		JLabel userLabel = new JLabel("Welcome New User");
		userLabel.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		userLabel.setForeground(DARK_YELLOW);
		userLabel.setBounds(350, 52, 375, 50);
		panel.add(userLabel);

		ImageIcon image = new ImageIcon("Popeyes.png");
		image.setImage(image.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH));
		JLabel pic = new JLabel(image);
		pic.setBounds(80, 52, 375, 50);
		panel.add(pic);

		ImageIcon image2 = new ImageIcon("Popeyes1.png");
		image2.setImage(image2.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH));
		JLabel pic2 = new JLabel(image2);
		pic2.setBounds(600, 52, 375, 50);
		panel.add(pic2);
		

		ImageIcon image3 = new ImageIcon("Popeyes3.png");
		image3.setImage(image3.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH));
		JLabel pic3 = new JLabel(image3);
		pic3.setBounds(80, 460, 375, 50);
		panel.add(pic3);

		ImageIcon image4 = new ImageIcon("Popeyes4.jpeg");
		image4.setImage(image4.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH));
		JLabel pic4 = new JLabel(image4);
		pic4.setBackground(VERY_DARK_RED);
		pic4.setBounds(600, 460, 375, 50);
		panel.add(pic4);
		
		JLabel firstName = new JLabel("First name");
		firstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		firstName.setBounds(58, 152, 99, 43);
		firstName.setForeground(DARK_YELLOW);
		panel.add(firstName);

		JLabel lastName = new JLabel("Last name");
		lastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lastName.setBounds(58, 243, 110, 29);
		lastName.setForeground(DARK_YELLOW);
		panel.add(lastName);

		JLabel emailAddress = new JLabel("Email");
		emailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emailAddress.setBounds(58, 324, 124, 36);
		emailAddress.setForeground(DARK_YELLOW);
		panel.add(emailAddress);

		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		firstname.setBounds(214, 151, 228, 50);
		firstname.setForeground(DARK_YELLOW);
		panel.add(firstname);
		firstname.setColumns(10);

		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lastname.setBounds(214, 235, 228, 50);
		lastname.setForeground(DARK_YELLOW);
		panel.add(lastname);
		lastname.setColumns(10);

		email = new JTextField();

		email.setFont(new Font("Tahoma", Font.PLAIN, 32));
		email.setBounds(214, 320, 228, 50);
		email.setForeground(DARK_YELLOW);
		panel.add(email);
		email.setColumns(10);

		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 32));
		username.setBounds(707, 151, 228, 50);
		username.setForeground(DARK_YELLOW);
		panel.add(username);
		username.setColumns(10);

		JLabel userName = new JLabel("Username");
		userName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userName.setForeground(DARK_YELLOW);
		userName.setBounds(542, 159, 99, 29);

		panel.add(userName);

		JLabel passWord = new JLabel("Password");
		passWord.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passWord.setBounds(542, 245, 99, 24);
		passWord.setForeground(DARK_YELLOW);
		panel.add(passWord);

		JLabel phoneNumber = new JLabel("Phone Number");
		phoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phoneNumber.setBounds(542, 329, 139, 26);
		phoneNumber.setForeground(DARK_YELLOW);
		panel.add(phoneNumber);

		phoneNum = new JTextField();
		phoneNum.setFont(new Font("Tahoma", Font.PLAIN, 32));
		phoneNum.setBounds(707, 320, 228, 50);
		panel.add(phoneNum);
		phoneNum.setForeground(DARK_YELLOW);
		phoneNum.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
		passwordField.setBounds(707, 235, 228, 50);
		passwordField.setForeground(DARK_YELLOW);
		panel.add(passwordField);

		button = new JButton("Register");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstname.getText();
				String lastName = lastname.getText();
				String emailId = email.getText();
				String userName = username.getText();
				String mobileNumber = phoneNum.getText();
				String password = passwordField.getText();
				int length = password.length();

				String msg = "" + firstName;
				msg += " \n";

				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/signlogin",
							"root", "register");

					String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName
							+ "','" + password + "','" + emailId + "','" + mobileNumber + "')";

					//String checkForAccount = "SELECT * FROM signlogin.account where email_Id=? and mobile_number=?";

					Statement statement = connection.createStatement();
					int acc = statement.executeUpdate(query);
				//	ResultSet emailCheck = statement.executeQuery("select * from signlogin.account where email_id='" + emailId + "'");
//					ResultSet numberCheck = statement.executeQuery("select * from signlogin.account where mobile_number='" + mobileNumber + "'");
//					ResultSet userNameCheck = statement.executeQuery("select * from signlogin.account where user_name='" + userName + "'");
//					
//					if (emailCheck.next()) {
//						JOptionPane.showMessageDialog(button, "There is already an existing account with the email entered");
//					}
//					int x = statement.executeUpdate(query);
					 if (acc == 0 ) {
					JOptionPane.showMessageDialog(button, "There is already an existing account with the email entered");
					} 
//					
//					else if (numberCheck.next()) {
//						JOptionPane.showMessageDialog(button, "There is already an existing account with the phone number entered");
//					}
//
//					else if (userNameCheck.next()) {
//						JOptionPane.showMessageDialog(button, "Please enter a different username. There is already an existing account with the username entered");
//					}
					else if (length < 8) {
						JOptionPane.showMessageDialog(button, "Please enter 8 valid characters that include one capital case, one number, and at least one special character ");
					}
					else
					{
						JOptionPane.showMessageDialog(button,
								"Welcome, " + msg + "Your account was sucessfully created");
						Login.main(null);
					}
					connection.close();
				} catch (Exception exception) {
					exception.printStackTrace();
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		button.setBounds(399, 447, 259, 74);
		button.setBackground(DARK_YELLOW);
		button.setForeground(DARK_YELLOW);
		panel.add(button);
	}
}
