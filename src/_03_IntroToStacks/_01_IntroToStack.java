package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		int zeronumber;
		int onenumber;
		String twonumbers = JOptionPane.showInputDialog("Enter two numbers inbetween 0 and 100 with a space inbetween");
		String[] name = twonumbers.split(" ");
		zeronumber = Integer.parseInt(name[0]);
		onenumber = Integer.parseInt(name[1]);
		Stack <Double> number = new Stack <Double>();
		for (Double i = 0.0; i <101; i++) {
			number.push(i);
			if (i > zeronumber && i < onenumber) {
				JOptionPane.showMessageDialog(null, number.pop());
			}
		}
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
	
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
