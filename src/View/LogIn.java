package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
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
	public LogIn() {
		setTitle("Log In");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel.setBounds(67, 108, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblPassword.setBounds(67, 190, 77, 14);
		contentPane.add(lblPassword);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(174, 102, 266, 20);
		contentPane.add(textPane);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 188, 266, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnLogin.setBounds(174, 279, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Sign-Up");
		btnSignup.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnSignup.setBounds(351, 279, 89, 23);
		contentPane.add(btnSignup);
		
		JLabel lblPiattaformaGaming = new JLabel("Piattaforma Gaming");
		lblPiattaformaGaming.setForeground(new Color(204, 0, 0));
		lblPiattaformaGaming.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblPiattaformaGaming.setBounds(174, 33, 189, 28);
		contentPane.add(lblPiattaformaGaming);
	}
}
