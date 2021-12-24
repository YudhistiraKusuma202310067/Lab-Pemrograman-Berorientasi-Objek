package com.ibik.library.app.login;

import java.awt.EventQueue;

import java.awt.Font; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 
import javax.swing.JPasswordField; 
import javax.swing.JTextField; 
import javax.swing.SwingConstants; 
import javax.swing.border.TitledBorder;

import com.ibik.library.app.connection.ConnectionDB;
import com.ibik.library.app.dashboard.Dashboard;
import com.ibik.library.app.model.User;

import javax.swing.JOptionPane;

public class LoginController {

	private JFrame frmLoginLibrary;
	private JTextField textUsername;
	private JPasswordField textPassword;
    private JButton btnLogin;
    private static User user;
    
	public void setTextUsername(JTextField textUsername) {
		this.textUsername = textUsername;
	}
	
	public String getTextUsername() {
		return textUsername.getText();
	}
	
	public void setTextPassword(JPasswordField textPassword) {
		this.textPassword = textPassword;
	}
	
	public String getTextPassword() {
		return String.valueOf(textPassword.getPassword());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginController window = new LoginController();
					window.frmLoginLibrary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginController() {
		ConnectionDB conn =  new ConnectionDB();
		try {
			conn.connect();
			initialize();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginLibrary = new JFrame();
		frmLoginLibrary.setResizable(false);
		frmLoginLibrary.setTitle("Login - Library IBIK");
		frmLoginLibrary.setBounds(100, 100, 500, 646);
		frmLoginLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginLibrary.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Documents\\IBI Kesatuan\\Praktek\\Java\\logo-ibik-web.png"));
		lblNewLabel.setBounds(187, 11, 105, 139);
		frmLoginLibrary.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistem Informasi Perpustakaan");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 160, 441, 25);
		frmLoginLibrary.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login to your account", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(25, 241, 441, 271);
		frmLoginLibrary.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsername.setBounds(29, 52, 61, 36);
		panel.add(lblUsername);
		
		textUsername = new JTextField();
		textUsername.setBounds(112, 52, 280, 36);
		panel.add(textUsername);
		textUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPassword.setBounds(29, 135, 61, 14);
		panel.add(lblPassword);
		
		textPassword = new JPasswordField();
		textPassword.setBounds(112, 124, 280, 36);
		panel.add(textPassword);
		textPassword.setColumns(10);
		
		btnLogin = new JButton("Login");  
		btnLogin.setBounds(222, 198, 170, 29);
		btnLogin.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				String username = textUsername.getText();
				String password = String.valueOf(textPassword.getPassword());
				
				//new LoginController().validasi(username, password);
				MyResults result = new LoginController().ValidationForm(username, password);
				if(result.getResponse()) {
					frmLoginLibrary.dispose();
					new Dashboard(null).setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, result.getLabel(),"Error",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(222, 198, 170, 29);
		panel.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(29, 198, 170, 29);
		panel.add(btnReset);
		
		JLabel lblNewLabel_3 = new JLabel("(c) 2021 Yudhistira Kusuma (202310067)");
		lblNewLabel_3.setBounds(25, 582, 441, 14);
		frmLoginLibrary.getContentPane().add(lblNewLabel_3);
	}
	
	public class MyResults extends LoginController {
		private boolean Response;
		private String Label;

		public void setResponse(boolean response) {
			Response = response;
		}
		public boolean getResponse() {
			return Response;
		}
		public void setLabel(String label) {
			Label = label;	
		}
		public String getLabel() {
			return Label;
		}
	}	
	
	public MyResults ValidationForm(String username, String password) {
		MyResults m = new MyResults();
		if (username.isEmpty() || password.isEmpty()) {
			//JOptionPane.showMessageDialog(null, "Mohon masukan username dan password anda", "Error", JOptionPane.ERROR_MESSAGE);
			m.setResponse(false);
			m.setLabel("Fill both the username and password fields");
		} else if (isNumber(username) == false || isNumber(password) == false) {
			//JOptionPane.showMessageDialog(null, "Username dan password harus menggunakan angka", "Warning!", JOptionPane.ERROR_MESSAGE);
			m.setResponse(false);
			m.setLabel("This entry can only contain numbers");
		} else if (username.length() > 10) {
			//JOptionPane.showMessageDialog(null, "Maximum inputan username 10 digit", "Warning!", JOptionPane.ERROR_MESSAGE);
			m.setResponse(false);
			m.setLabel("Keywoard must not exceed 10 characters");		
		} else if (password.length() > 6) {
			//JOptionPane.showMessageDialog(null, "Maximum inputan password 6 digit", "Warning!", JOptionPane.ERROR_MESSAGE);
			m.setResponse(false);
			m.setLabel("Keywoard must not exceed 6 characters");
		} else {
			User users = new User();
			//Long NIK = Long.parseLong(username);
			String NIK = username;
			users.setNIK(NIK);
			users.setPassword(password);
			
			LoginDao loginDao = new LoginDao();
			try {
				user = loginDao.checkLogin(users);
				System.out.println("NIK "+user.getNIK());
				System.out.println("Fullname "+user.getFullName());
				m.setResponse(true);
				m.setLabel("Wellcome to this application");

			}catch (Exception e) {
				e.printStackTrace();
				m.setResponse(false);
				m.setLabel("You have entered an invalid username or password");
			}
		}
		return m;
	}

	public boolean isNumber(String username) {
		try {
			Double x = Double.parseDouble(username);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
} 