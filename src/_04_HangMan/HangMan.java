package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.omg.Messaging.SyncScopeHelper;

public class HangMan implements KeyListener {
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.question();
		hangman.setup();

	}

	JFrame frame;
	JPanel panel;
	JTextField field;
	JLabel label;
	String blanks = "";
	String word = "";

	void question() {
		String answer = JOptionPane.showInputDialog("Guess a number up to 266");
		Stack<String> words = new Stack<String>();
		int converted = Integer.parseInt(answer);
		for (int i = 0; i < converted; i++) {
			words.push(Utilities.readRandomLineFromFile("dictionary.txt"));

		}

		word = words.pop();
		int length = word.length();
		for (int i = 0; i < length; i++) {
			blanks += " _ ";
		}

	}

	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		field = new JTextField();
		label = new JLabel();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		label.setText(blanks);
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(blanks);
		Character guess = e.getKeyChar();
		for (int i = 0; i < word.length(); i++) {
			if (e.getKeyChar() == word.charAt(i)) {
				//blanks = blanks.substring(0, i) + guess;
				if (i == word.length() - 1) {
					blanks = blanks.substring(0, i) + guess;
				} else if (i == 0) {
					blanks = guess + blanks.substring(i + 1);
				} else {
					blanks = blanks.substring(0, i) + guess + blanks.substring(i + 1);
				}

			}
		}label.setText(blanks);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
