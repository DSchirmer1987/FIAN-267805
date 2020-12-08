/**
 * Daniel Schirmer
 *
 * 08.12.2020
 * Project : Tag_10
 * ©2020
 *
 */

package swingtest;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class SwingTest {

	public static void main(String[] args) {
		MyFrame myframe = new MyFrame();
		MyButton myButton = new MyButton("Button 1", "Button1");
		MyButton myButton2 = new MyButton("Button 2", "Button2");
		MyButton myButton3 = new MyButton("Button 3", "Button3");
		JPanel jpanel = new JPanel(new GridLayout(1,5));
		jpanel.add(myButton);
		jpanel.add(myButton2);
		jpanel.add(myButton3);
		myframe.add(jpanel);
		myframe.setVisible(true);
	}

}
