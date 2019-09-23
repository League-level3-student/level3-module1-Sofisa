package _04_HangMan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan{
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.setup();
		hangman.firstPhase();
		
	}
	
	
	JFrame frame;
	JPanel panel;
	JTextField field;
	JLabel label;
	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		field = new JTextField();
		label = new JLabel();
		frame.setSize(500,500);
		frame.add(panel);
		panel.add(field);
	   
	}
	
	void firstPhase() {
		label.setText("Guess a number up to 266");
		String recieved = field.getText();
		int input = Integer.parseInt(recieved);
		//for (int i = 0; i < input; i++) {
			
		//}
	}
	
}
