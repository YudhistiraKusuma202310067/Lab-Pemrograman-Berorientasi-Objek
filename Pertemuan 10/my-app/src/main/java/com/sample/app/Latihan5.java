package com.sample.app;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Latihan5 {
    public static void main(String[] args) {
        String nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
        while (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field Tidak Boleh Kosong", "Peringatan", JOptionPane.ERROR_MESSAGE);
            nama = JOptionPane.showInputDialog(null, "Siapa Nama Kamu?");
        }

        Latihan5 myObj = new Latihan5();
        
        String label ="";
        int inputButton = JOptionPane.showConfirmDialog(null, 
            "Apakah kamu suka burger?",
            "Pertanyaan",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (inputButton == 0) {
            String jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga Burger : Rp 38.000\nMasukkan Jumlah Burger yang Dipesan :");
            while (myObj.isNumber(jumlahBurgerString) == false) {
                JOptionPane.showMessageDialog(null, "Input yang Dimasukkan Harus Berupa Angka", "Error", JOptionPane.ERROR_MESSAGE);
                jumlahBurgerString= JOptionPane.showInputDialog(null,"Harga Burger : Rp 38.000\nMasukkan Jumlah Burger yang Dipesan :");
            }
            Double jumlahBurger = Double.parseDouble(jumlahBurgerString);
            Double hargaBurger = jumlahBurger*38000;
            String hargaBurgerString = hargaBurger+"";
            label = nama + " Suka Burger\nBurger yang Dipesan : " + jumlahBurgerString + "\nHarga Burger = " + hargaBurgerString ;
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 1) {
            label = nama + " Tidak Suka Burger";
            JOptionPane.showMessageDialog(null, label, "Pilihan", JOptionPane.INFORMATION_MESSAGE);
        } else if (inputButton == 2) {
            JOptionPane.showMessageDialog(null, nama + " Tidak Memilih Apapun", "Pilihan", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }

    public boolean isNumber(String jumlah) {
        try {
            Double x = Double.parseDouble(jumlah);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}