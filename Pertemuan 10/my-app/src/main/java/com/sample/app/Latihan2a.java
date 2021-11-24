package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan2a {
	public static void main(String[] args) {
        String label="";
		int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah Kamu Suka Burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
		
		if (inputButton == 0) {
            label = "Aku Suka Burger";
		}
		else if (inputButton == 1) {
            label = "Aku Tidak Suka Burger";
		}
		else{
            label = "Aku Tidak Memilih Apapun";
		}
        JOptionPane.showMessageDialog(null, label);
	}
}