package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan3 {
	public static void main(String[] args) {
        String label="";
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
		int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah Kamu Suka Burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
		
		if (inputButton == 0) {
            label = nama + " Suka Burger";
		}
		else if (inputButton == 1) {
            label = nama + " Tidak Suka Burger";
		}
		else{
            label = nama + " Tidak Memilih Apapun";
		}
        JOptionPane.showMessageDialog(null, label);
	}
}