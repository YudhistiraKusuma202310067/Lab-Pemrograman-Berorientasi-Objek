package com.ibik.library.app.dashboard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.ibik.library.app.login.LoginController;
import com.ibik.library.app.login.LoginDao;
import com.ibik.library.app.model.User;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
    private  User user;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dashboard(User user) {
		contentPane = new JPanel();
		LoginController lc = new LoginController();
		LoginDao ld = new LoginDao();
		this.user = user;
		
		try {
			setTitle("Dashboard");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 500, 646);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Welcome to this application");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(110, 57, 280, 30);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("NIK");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(60, 169, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Fullname");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(241, 169, 61, 14);
			contentPane.add(lblNewLabel_2);
			
			textField = new JTextField();
			textField.setBounds(60, 194, 165, 30);
			contentPane.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(241, 194, 165, 30);
			contentPane.add(textField_1);
			
			JLabel lblNewLabel_3 = new JLabel("PlaceBirth");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(60, 261, 61, 14);
			contentPane.add(lblNewLabel_3);
			
			textField_2 = new JTextField();
			textField_2.setBounds(60, 286, 127, 30);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_4 = new JLabel("BirthDate");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(199, 261, 61, 14);
			contentPane.add(lblNewLabel_4);
			
			textField_3 = new JTextField();
			textField_3.setBounds(199, 286, 103, 30);
			contentPane.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel lblNewLabel_5 = new JLabel("Gender");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_5.setBounds(317, 261, 46, 14);
			contentPane.add(lblNewLabel_5);
			
			textField_4 = new JTextField();
			textField_4.setBounds(312, 286, 94, 30);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_6 = new JLabel("Address");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_6.setBounds(60, 343, 61, 14);
			contentPane.add(lblNewLabel_6);
			
			textField_5 = new JTextField();
			textField_5.setBounds(60, 368, 346, 122);
			contentPane.add(textField_5);
			textField_5.setColumns(10);
			
			JLabel lblNewLabel_7 = new JLabel("Email");
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_7.setBounds(60, 501, 46, 14);
			contentPane.add(lblNewLabel_7);
			
			textField_6 = new JTextField();
			textField_6.setBounds(60, 526, 165, 30);
			contentPane.add(textField_6);
			textField_6.setColumns(10);
			
			JLabel lblNewLabel_8 = new JLabel("Password");
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_8.setBounds(241, 501, 79, 14);
			contentPane.add(lblNewLabel_8);
			
			textField_7 = new JTextField();
			textField_7.setColumns(10);
			textField_7.setBounds(241, 526, 165, 30);
			contentPane.add(textField_7);
			
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Your profile", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(25, 130, 434, 446);
			contentPane.add(panel);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
