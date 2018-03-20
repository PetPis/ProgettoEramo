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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

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
		setBounds(100, 100, 525, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setBounds(227, 70, 232, 16);
		contentPane.add(txtpnName);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblName.setBounds(67, 70, 61, 16);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblSurname.setBounds(67, 112, 61, 16);
		contentPane.add(lblSurname);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblPassword.setBounds(67, 197, 61, 22);
		contentPane.add(lblPassword);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblEmail.setBounds(67, 276, 61, 16);
		contentPane.add(lblEmail);
		
		JLabel lblConfermaPassword = new JLabel("Conferma Password");
		lblConfermaPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblConfermaPassword.setBounds(67, 231, 135, 16);
		contentPane.add(lblConfermaPassword);
		
		JTextPane txtpnCcccc = new JTextPane();
		txtpnCcccc.setBounds(227, 112, 232, 16);
		contentPane.add(txtpnCcccc);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(227, 276, 232, 16);
		contentPane.add(textPane_2);
		
		JButton btnCancell = new JButton("Cancel");
		btnCancell.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnCancell.setBounds(229, 326, 100, 29);
		contentPane.add(btnCancell);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConfirm.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnConfirm.setBounds(359, 326, 100, 29);
		contentPane.add(btnConfirm);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(227, 196, 232, 26);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(227, 227, 232, 26);
		contentPane.add(passwordField_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblUsername.setBounds(67, 156, 92, 16);
		contentPane.add(lblUsername);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(227, 156, 232, 16);
		contentPane.add(textPane);
		
		JLabel lblRegistrazione = new JLabel("Registrazione");
		lblRegistrazione.setForeground(Color.RED);
		lblRegistrazione.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblRegistrazione.setBounds(194, 6, 135, 28);
		contentPane.add(lblRegistrazione);
	}
}
