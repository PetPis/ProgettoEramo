package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import src.controller.UtenteController;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.Map;
import java.util.TreeMap;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;

public class UtenteProfiloGaming extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UtenteProfiloGaming frame = new UtenteProfiloGaming();
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
	public UtenteProfiloGaming() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Username:");
		label.setFont(new Font("Consolas", Font.PLAIN, 13));
		label.setBounds(10, 78, 114, 14);
		contentPane.add(label);
		
		JLabel lblExp = new JLabel("Punti Exp:");
		lblExp.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblExp.setBounds(10, 139, 114, 14);
		contentPane.add(lblExp);
		
		JLabel lblLivello = new JLabel("Livello:");
		lblLivello.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLivello.setBounds(10, 103, 114, 14);
		contentPane.add(lblLivello);
		
		JLabel lblTrofei = new JLabel("Trofei:");
		lblTrofei.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblTrofei.setBounds(10, 175, 114, 14);
		contentPane.add(lblTrofei);
		
		JLabel label_1 = new JLabel("<dynamyc>");
		label_1.setFont(new Font("Comic Sans MS", Font.ITALIC, 13));
		label_1.setBounds(134, 78, 114, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(134, 105, 114, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("0");
		label_3.setBounds(134, 141, 114, 14);
		contentPane.add(label_3);
		
		JLabel gaming = new JLabel("Profilo Gaming");
		gaming.setForeground(Color.RED);
		gaming.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		gaming.setBounds(170, 11, 155, 30);
		contentPane.add(gaming);
		
		JButton btnVisualizzaTrofei = new JButton("Visualizza Trofei");
		btnVisualizzaTrofei.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnVisualizzaTrofei.setBounds(134, 166, 164, 23);
		contentPane.add(btnVisualizzaTrofei);
		
		JLabel lblTimeline = new JLabel("Timeline:");
		lblTimeline.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblTimeline.setBounds(10, 217, 114, 14);
		contentPane.add(lblTimeline);
		
		TreeMap<Integer,String> timeline = new UtenteController().timeline(utente.getUsername());
		
		String[] column_names = { "Data", "Livello" };
		Object[][] timelineTable = new Object[timeline.size()][2];
		int count = 0;
		for( Map.Entry<Integer,String> entry : timeline.entrySet() ){
			timelineTable[count][0] = entry.getValue();
			timelineTable[count][1] = entry.getKey();
			count++;
		}

		JTable showTimeline = new JTable(timelineTable, column_names);
		JScrollPane scroll = new JScrollPane(showTimeline);
		scroll.setBounds(134, 227, 320, 85);
		scroll.getVerticalScrollBar().setUnitIncrement(20);
		contentPane.add(scroll);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		btnHome.setBounds(411, 338, 89, 23);
		contentPane.add(btnHome);
	}
}
