package prototyp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ScrollPaneConstants;

public class Prototyp_01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototyp_01 frame = new Prototyp_01();
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
	public Prototyp_01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 638);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 859, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WK");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(255, 140, 0));
		lblNewLabel.setBounds(821, 11, 43, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SU");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(255, 140, 0));
		lblNewLabel_1.setBounds(768, 11, 43, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Logo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(50, 205, 50));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(10, 11, 43, 30);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(63, 11, 695, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 88, 859, 55);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(273, 5, 180, 39);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Eins", "Zwei"}));
		panel_1.add(comboBox);
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(5, 154, 859, 434);
		contentPane.add(scrollPane);
		int anzahlErgebnisse = 10;
		
		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(new GridLayout(anzahlErgebnisse, 1, 0, 0));
		
		
		for (int i = 0; i <= anzahlErgebnisse; i++) {
			panel_2.add(new SearchResult());
		}
		
	}
}
