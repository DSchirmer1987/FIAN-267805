/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingdemo;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemo {
	public static int clicked = 0;

	public static void main(String[] args) {
		JFrame jframe = new JFrame("Das Fenster mit Swing");
		jframe.setSize(600, 400);
		jframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		jframe.setResizable(false);
		
		JPanel jpanel = new JPanel(new GridLayout(4,4));
		
		// JLabel
		JLabel jlabel = new JLabel();
		jlabel.setText("<html>Dies ist ein JLabel.<p/> Dies ist eine zweite Zeile</html>");
		
		// Image
		ImageIcon iconImage = new ImageIcon(SwingDemo.class.getResource("icon.png"));
		Image image = iconImage.getImage();
		Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
		Icon icon = new ImageIcon(newimg);

		jframe.setIconImage(image);
		jlabel.setIcon(icon);
		jlabel.setSize(150, 50);
		jframe.addWindowListener(new MyWindowListenerTwo());
		
		JTextField textfield = new JTextField("Bitte einen Text eigeben.");
		
		// JButton
		JButton jbutton = new JButton();
		jbutton.setText("Ich bin ein Button");
		jbutton.setPreferredSize(new Dimension(50,50));
		jbutton.addMouseListener(new MouseAdapter() {
			@Override public void mouseClicked(MouseEvent e) {
				clicked++;
				System.out.println(jbutton.getText());
				System.out.println(e.getClickCount());
				System.out.println("Button wurde geklickt");
				String text;
//				text = JOptionPane.showInputDialog("Bitte einen Text eingeben");
				jlabel.setText(textfield.getText());
			}
		});
		
		jbutton.addKeyListener(new KeyAdapter() {
			@Override public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyCode());
				System.out.println(e.getKeyChar());
			}
		});
		
				
		jpanel.add(jlabel);
		jpanel.add(jbutton);
		jpanel.add(textfield);
		
		jframe.setContentPane(jpanel);
		jframe.setVisible(true);
		System.out.println(jlabel.getText());
	}

}
