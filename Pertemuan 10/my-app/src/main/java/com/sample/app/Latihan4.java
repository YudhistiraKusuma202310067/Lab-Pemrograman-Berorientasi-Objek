package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan4 {
	public static void main(String[] args) {
        String label="";
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
		int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah Kamu Suka Burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
		
		if (inputButton == 0) {
            String jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga Burger : Rp 38.000\nMasukkan Jumlah Burger yang Dipesan :");
            Double jumlahBurger = Double.parseDouble(jumlahBurgerString);
            Double hargaBurger = jumlahBurger*38000;
            String hargaBurgerString = hargaBurger+"";
            label = nama + "Suka Burger\nBurger yang Dipesan : " + jumlahBurgerString + "\nHarga Burger = " + hargaBurgerString ;
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (inputButton == 1) {
            label = nama + " Tidak Suka Burger";
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
            label = nama + " Tidak Memilih Apapun";
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}