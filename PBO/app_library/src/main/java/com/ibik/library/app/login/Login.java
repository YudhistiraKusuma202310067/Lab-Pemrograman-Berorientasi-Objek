package main.java.com.ibik.library.app.login;

import java.awt.Color; 
import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField; 
import javax.swing.SwingConstants; 
import javax.swing.border.TitledBorder; 
import javax.swing.JOptionPane;

public class Login extends JFrame {
    private JFrame frmLoginPage;  
    private JTextField textUsername;  
    private JPasswordField textPassword;  
    private JButton btnSignIn;

    public static void main(String[] args) {
		Login frmLoginPage = new Login(); //initalisasi object pada class Main sebagai bagian dari JFrame
		frmLoginPage.setTitle("Login Page"); // set title pada window
		frmLoginPage.setResizable(false); // membuat window tidak bisa melakukan resizeable atau maximize window
		frmLoginPage.setBounds(100, 100, 500, 646); // set ukuran window dengan format (x, y, width, height). Dimana x dan y mengatur tata letak posisi window ketika pertama kali dijalankan
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //action ketika menutup window untuk mengakhiri program 
		frmLoginPage.getContentPane().setLayout(null);
				
		frmLoginPage.initialize(frmLoginPage);
		frmLoginPage.actionInitialize();
		
		frmLoginPage.setVisible(true);
	}

    private void initialize(JFrame frmLoginPage) {
		JLabel labelLogo = new JLabel("logo");
		labelLogo.setBackground(Color.WHITE);
		labelLogo.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Documents\\IBI Kesatuan\\Praktek\\Java\\logo-ibik-web.png"));
		labelLogo.setBounds(183, 0, 110, 127);
		frmLoginPage.getContentPane().add(labelLogo);

    	JLabel labelTitle1 = new JLabel("Sistem Informasi Perpustakaan");
		labelTitle1.setBackground(Color.YELLOW);
		labelTitle1.setForeground(Color.BLACK);
		labelTitle1.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitle1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		labelTitle1.setBounds(25, 138, 441, 25);
		frmLoginPage.getContentPane().add(labelTitle1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 209, 441, 271);
		frmLoginPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel LabelUsername = new JLabel("Username");
		LabelUsername.setBounds(29, 38, 72, 14);
		panel.add(LabelUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(29, 63, 363, 36);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel LabelPassword = new JLabel("Password");
		LabelPassword.setBounds(29, 122, 363, 14);
		panel.add(LabelPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(29, 147, 363, 36);
		panel.add(textPassword);
				
		btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(303, 208, 89, 36);
		panel.add(btnSignIn);
		
		JLabel lblNewLabel = new JLabel("(c) 2021 Febri Damatraseta, S.T, M.Kom");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel.setBounds(25, 582, 441, 14);
		frmLoginPage.getContentPane().add(lblNewLabel);		
		
	}
	
	private void actionInitialize(){
		//memberikan aksi setelah tombol Sign In dipencet
		btnSignIn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {				
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				if (username.isEmpty() && password.isEmpty()) { //kondisi dimana username dan password kosong
					JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda", "Error", JOptionPane.ERROR_MESSAGE);
				} else if (isNumber(username) == false) { //kondisi dimana username yang dimasukkan bukan angka
					JOptionPane.showMessageDialog(null, "Harap masukan angka", "Warning!", JOptionPane.ERROR_MESSAGE);
				} else if (username.length() > 10) { //kondisi dimana input username melebihi space yang disediakan
					JOptionPane.showMessageDialog(null, "Maximum inputan username 10 digit", "Warning!", JOptionPane.ERROR_MESSAGE);
				} else if (password.length() > 6) { //kondisi dimana input username melebihi space yang disediakan
					JOptionPane.showMessageDialog(null, "Maximum inputan password 6 digit", "Warning!", JOptionPane.ERROR_MESSAGE);
				} else if (username.equalsIgnoreCase("202310067") && password.equalsIgnoreCase("171202")) { //kondisi dimana username dan password sesuai dengan npm dan tanggal lahir yang telah di set
					JOptionPane.showMessageDialog (null,"Selamat datang di aplikasi Perpustakaan IBIK", "Halo!", JOptionPane.INFORMATION_MESSAGE);
				} else if (username != "202310067" && password != "171202") { //kondisi dimana username dan password tidak sesuai dengan npm dan tanggal lahir yang telah di set
					JOptionPane.showMessageDialog (null,"Data yang anda masukan salah", "Error", JOptionPane.ERROR_MESSAGE);	
				}

				System.out.println("username:"+username);
				System.out.println("password:"+password);

			}

			//fungsi untuk menentukan input yang diberikan berupa huruf atau angka
			public boolean isNumber(String username) {
				try {
					Double x = Double.parseDouble(username);
					return true;
				} catch (Exception e) {
					return false;
				}
			}
		
		});		
	}
}