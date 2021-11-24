package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan2 {
	public static void main(String[] args) {
		int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah Kamu Suka Burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
		
		if (inputButton == 0) {
			JOptionPane.showMessageDialog(null, "Aku Suka Burger", "Yes!", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (inputButton == 1) {
            JOptionPane.showMessageDialog(null, "Aku Tidak Suka Burger", "No!", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
            JOptionPane.showMessageDialog(null, "Aku Tidak Memilih Apapun", "Cancel", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}