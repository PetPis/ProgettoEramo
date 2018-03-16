package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Piattaforma Gaming");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 341);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblUsername.setBounds(107, 76, 108, 25);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblPassword.setBounds(107, 142, 71, 13);
		contentPane.add(lblPassword);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(282, 76, 108, 20);
		contentPane.add(textPane_1);
		
		JButton btnLogin = new JButton("Log-In");
		btnLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnLogin.setBounds(89, 207, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Sign-Up");
		btnSignup.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnSignup.setBounds(301, 209, 89, 23);
		contentPane.add(btnSignup);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(282, 135, 108, 20);
		contentPane.add(passwordField);
	}
}
