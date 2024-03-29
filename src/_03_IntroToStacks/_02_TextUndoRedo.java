package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 *
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	
	String type = "";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
    JLabel label = new JLabel();
    Stack <Character> keys = new Stack <Character>();
	public static void main(String[] args) {
    _02_TextUndoRedo textredo = new _02_TextUndoRedo();
    textredo.setup();
   
    
 
    
	}
	void setup() {
	    frame.add(panel);
	    panel.add(label);
	    frame.addKeyListener(this);
	    frame.setSize(800, 800);;
	    frame.setVisible(true);
	    panel.setVisible(true);
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		
		
		if (KeyEvent.VK_BACK_SPACE ==e.getKeyCode()) {
			type = type.substring(0,type.length() - 1);
			keys.push(type.charAt(type.length() - 1));	
		}
		
		else if (KeyEvent.VK_DOWN == e.getKeyCode()) {
			type = type + keys.pop();
			label.setText(type);
		}else {
			type = type + e.getKeyChar();
		}
		
		label.setText(type);
		}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
