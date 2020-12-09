package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class else_if_are_you_happy {
public static void main(String[] args) {
	
String answer = JOptionPane.showInputDialog("Are you happy?");
	if(answer.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
	}
	else if(answer.equalsIgnoreCase("no")) {
		String answer2 = JOptionPane.showInputDialog("Do you want to be happy?");
		if(answer2.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else if(answer2.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		}
	}
	
	
	
	
	
	
	
	
	
	
}
}
