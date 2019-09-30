package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HangMan{
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.question();
		hangman.setup();
		
		
	}
	
	
	JFrame frame;
	JPanel panel;
	JTextField field;
	JLabel label;
	
	void question() {
		String answer = JOptionPane.showInputDialog("Guess a number up to 266");
		Stack <String> words = new Stack <String>();
		int converted = Integer.parseInt(answer);
		for (int i = 0; i < converted; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
			System.out.println(words.pop());
		}
		
		
		
		
		
		
		
	}
	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		field = new JTextField();
		label = new JLabel();
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(field);
		panel.add(label);
		
	   
	}
	
	void firstPhase() {
		
	
	}
	
}
