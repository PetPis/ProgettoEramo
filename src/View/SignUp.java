package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setBounds(220, 31, 108, 16);
		contentPane.add(txtpnName);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblName.setBounds(71, 31, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblSurname.setBounds(71, 59, 61, 16);
		contentPane.add(lblSurname);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblPassword.setBounds(71, 117, 61, 22);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblEmail.setBounds(71, 179, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblConfermaPassword.setBounds(71, 151, 135, 16);
		contentPane.add(lblConfermaPassword);
		
		JTextPane txtpnCcccc = new JTextPane();
		txtpnCcccc.setBounds(220, 59, 108, 16);
		contentPane.add(txtpnCcccc);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(220, 179, 108, 16);
		contentPane.add(textPane_2);
		
		JButton btnCancell = new JButton("Cancel");
		btnCancell.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnCancell.setBounds(62, 227, 117, 29);
		contentPane.add(btnCancell);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnConfirm.setBounds(215, 227, 117, 29);
		contentPane.add(btnConfirm);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(220, 116, 108, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(220, 147, 108, 26);
		contentPane.add(passwordField_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblUsername.setBounds(71, 89, 92, 16);
		contentPane.add(lblUsername);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(220, 87, 108, 16);
		contentPane.add(textPane);
	}
}
