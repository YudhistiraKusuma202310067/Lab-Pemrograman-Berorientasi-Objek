package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan1 {
	
	public static void main(String[] args) {
		//windows dialog 
		JOptionPane.showMessageDialog(null, "Hello world");
		int inputButton = JOptionPane.showConfirmDialog(null, 
				"Do you like Rice ?",
				"Confirm",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.ERROR_MESSAGE);
		System.out.println("value input button:"+inputButton);
		
		//type message :
		//JOptionPane.ERROR_MESSAGE
		//INFORMATION_MESSAGE
		//QUESTION_MESSAGE

		String inputTextbox = JOptionPane.showInputDialog(null,"Enter your name", "Yudhis");
		System.out.println("value input text:"+inputTextbox);		
	}
}