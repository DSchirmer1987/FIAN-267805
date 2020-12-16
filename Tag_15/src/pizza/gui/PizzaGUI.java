/**
 * Daniel Schirmer
 *
 * 16.12.2020
 * Project : Tag_15
 * ©2020
 *
 */

package pizza.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pizza.PizzaOfen;
import pizza.bottoms.Crusty;
import pizza.bottoms.CuscinoSpeciale;
import pizza.bottoms.Munchy;
import pizza.toppings.Cheese;
import pizza.toppings.Chili;
import pizza.toppings.Ham;
import pizza.toppings.Onion;
import pizza.toppings.Salami;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.util.Formatter;
import java.util.Locale;

import javax.swing.Action;

public class PizzaGUI extends JFrame {
	private PizzaOfen pizzaOfen = new PizzaOfen();
	private int toppigcounter = 0;

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();
	private final Action action_7 = new SwingAction_7();
	
	private JPanel toppingPanel;
	private JPanel bottomPanel;
	
	private JLabel price;
	private JLabel veggie;
	private JLabel hot;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaGUI frame = new PizzaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void getElements(Component rootComp) {
		Container component = (Container) rootComp;
		for(Component innerComp : component.getComponents()) {
			getElements(innerComp);
			if(innerComp instanceof JButton) {
				((JButton) innerComp).setEnabled(true);
			}
		}
	}
	
	public static void getElements2(Component rootComp) {
		Container component = (Container) rootComp;
		for(Component innerComp : component.getComponents()) {
			getElements(innerComp);
			if(innerComp instanceof JButton) {
				((JButton) innerComp).setEnabled(false);
			}
		}
	}
	public static void toggleButtons(Component rootComp) {
		Container component = (Container) rootComp;
		for(Component innerComp : component.getComponents()) {
			getElements(innerComp);
			if(innerComp instanceof JButton) {
				((JButton) innerComp).setEnabled(!innerComp.isEnabled());
			}
		}
	}
	public void setLabelTextes() {
		Formatter format = new Formatter(Locale.GERMANY);
		String text = "Preis";
		format.format("%s: %.5f", text, (float)pizzaOfen.getPrice());
		price.setText(format.toString());
//		price.setText("Preis: " + pizzaOfen.getPrice());
		veggie.setText("Vegetable: " + pizzaOfen.isVegetable());
		hot.setText("Hot: " +pizzaOfen.isHot());
	}

	/**
	 * Create the frame.
	 */
	public PizzaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		bottomPanel = panel;
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Bottoms");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAction(action);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setAction(action_1);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_2);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		toppingPanel = panel_1;
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("Toppings");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setAction(action_3);
		btnNewButton_3.setEnabled(false);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setAction(action_4);
		btnNewButton_4.setEnabled(false);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setAction(action_5);
		btnNewButton_5.setEnabled(false);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setAction(action_6);
		btnNewButton_6.setEnabled(false);
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setAction(action_7);
		btnNewButton_7.setEnabled(false);
		panel_1.add(btnNewButton_7);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		price = lblNewLabel;
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		veggie = lblNewLabel_1;
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		hot = lblNewLabel_2;
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Crusty");
			putValue(SHORT_DESCRIPTION, "It's crusty");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Crusty());
			PizzaGUI.toggleButtons(toppingPanel);
			PizzaGUI.toggleButtons(bottomPanel);
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Munchy");
			putValue(SHORT_DESCRIPTION, "It's munchy!");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Munchy());
			PizzaGUI.toggleButtons(toppingPanel);
			PizzaGUI.toggleButtons(bottomPanel);
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Cuscino Speciale");
			putValue(SHORT_DESCRIPTION, "Speciale");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new CuscinoSpeciale());
			PizzaGUI.toggleButtons(toppingPanel);
			PizzaGUI.toggleButtons(bottomPanel);
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Chili");
			putValue(SHORT_DESCRIPTION, "Hot!");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Chili(pizzaOfen.getPizza().get(toppigcounter)));
			toppigcounter++;
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Ham");
			putValue(SHORT_DESCRIPTION, "Ham");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Ham(pizzaOfen.getPizza().get(toppigcounter)));
			toppigcounter++;
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "Cheese");
			putValue(SHORT_DESCRIPTION, "Cheesy");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Cheese(pizzaOfen.getPizza().get(toppigcounter)));
			toppigcounter++;
			PizzaGUI.this.setLabelTextes();
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "Onion");
			putValue(SHORT_DESCRIPTION, "Onions!");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Onion(pizzaOfen.getPizza().get(toppigcounter)));
			toppigcounter++;
			PizzaGUI.this.setLabelTextes();
			
		}
	}
	private class SwingAction_7 extends AbstractAction {
		public SwingAction_7() {
			putValue(NAME, "Salami");
			putValue(SHORT_DESCRIPTION, "Tasty");
		}
		public void actionPerformed(ActionEvent e) {
			pizzaOfen.addPizza(new Salami(pizzaOfen.getPizza().get(toppigcounter)));
			toppigcounter++;
			PizzaGUI.this.setLabelTextes();
		}
	}
}
