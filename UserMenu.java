package edu.cuny.csi.csc330.Restaurant;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.ResultSet;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
public class UserMenu extends JFrame {

	public static final Color VERY_DARK_RED = new Color(153, 0, 0);
	public static final Color DARK_YELLOW = new Color(255, 204, 0);
	private ShoppingCart items;
	private JTextField total;
	private static JButton button;

	public UserMenu(Catalog products) {

				setTitle(products.getName());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		items = new ShoppingCart();

	
		total = new JTextField("$0.00", 12);
		total.setEditable(false);
		total.setEnabled(false);
		total.setDisabledTextColor(Color.green);
		JPanel panel = new JPanel();
		panel.setBackground(DARK_YELLOW);
		JLabel label = new JLabel("Order Total");
		label.setForeground(VERY_DARK_RED);
		panel.add(label);
		panel.add(total);
		add(panel, BorderLayout.NORTH);

		JPanel discountPanel = new JPanel();
		final JCheckBox cb = new JCheckBox("Qualify for discount");
		cb.setForeground(VERY_DARK_RED);
		discountPanel.add(cb);
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.setDiscount(cb.isSelected());
				updateTotal();
			}
		});

		button = new JButton("Checkout");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button.getModel().isArmed()) {
					CheckoutCart.main(null);
				}
			}
		});
		button.setBounds(160, 170, 80, 50);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setForeground(VERY_DARK_RED);
		button.setBackground(VERY_DARK_RED);
		panel.add(button);

		panel = new JPanel(new GridLayout(products.size(), 1));
		for (int i = 0; i < products.size(); i++)
			addItem(products.get(i), panel);
		add(panel, BorderLayout.CENTER);

		panel = new JPanel();
		add(checkBoxPanel(), BorderLayout.SOUTH);

		pack();
	}

	private JPanel checkBoxPanel() {
		JPanel panel = new JPanel();
		panel.setBackground(DARK_YELLOW);
		final JCheckBox cb = new JCheckBox("Qualify for discount");
		cb.setForeground(VERY_DARK_RED);
		panel.add(cb);
		cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items.setDiscount(cb.isSelected());
				updateTotal();
			}
		});
		return panel;
	}

	
	private void addItem(final Item product, JPanel panel) {
		JPanel count = new JPanel(new FlowLayout(FlowLayout.LEFT));
		count.setBackground(VERY_DARK_RED);
		final JTextField quantity = new JTextField(3);
		quantity.setHorizontalAlignment(SwingConstants.CENTER);
		quantity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateItem(product, quantity);
				quantity.transferFocus();
			}
		});
		quantity.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent e) {
				updateItem(product, quantity);
			}
		});
		count.add(quantity);
		JLabel label = new JLabel("" + product);
		label.setForeground(DARK_YELLOW);
		count.add(label);
		panel.add(count);
	}

	
	private void updateItem(Item product, JTextField quantity) {
		int number;
		String text = quantity.getText().trim();
		try {
			number = Integer.parseInt(text);
		} catch (NumberFormatException error) {
			number = 0;
		}
		if (number <= 0 && text.length() > 0) {
			Toolkit.getDefaultToolkit().beep();
			quantity.setText("");
			number = 0;
		}
		items.add(new ItemOrder(product, number));
		updateTotal();
	}


	private void updateTotal() {
		double amount = items.getTotal();
		total.setText(NumberFormat.getCurrencyInstance().format(amount));
	}

}
