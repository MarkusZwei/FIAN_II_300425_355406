package prototyp2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridLayout;

public class Prototyp {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JMenuBar menuBar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototyp window = new Prototyp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prototyp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 774, 510);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel pnl_Suchleiste = new JPanel();
		pnl_Suchleiste.setBackground(Color.GRAY);
		pnl_Suchleiste.setBounds(0, 0, 760, 50);
		frame.getContentPane().add(pnl_Suchleiste);
		pnl_Suchleiste.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGO");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 150, 30);
		pnl_Suchleiste.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 11, 440, 30);
		pnl_Suchleiste.add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel_3 = new JLabel("SU");
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(Color.YELLOW);
		lblNewLabel_3.setBounds(625, 11, 30, 30);
		pnl_Suchleiste.add(lblNewLabel_3);
		
		lblNewLabel_1 = new JLabel("LI");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(670, 11, 30, 30);
		pnl_Suchleiste.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("WK");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(Color.YELLOW);
		lblNewLabel_2.setBounds(715, 11, 30, 30);
		pnl_Suchleiste.add(lblNewLabel_2);
		
		JPanel pnl_menu = new JPanel();
		pnl_menu.setBackground(Color.ORANGE);
		pnl_menu.setBounds(0, 50, 760, 20);
		frame.getContentPane().add(pnl_menu);
		pnl_menu.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 376, 22);
		pnl_menu.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Kategorien");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("B\u00FCcher");
		mntmNewMenuItem_3.setVerticalAlignment(SwingConstants.TOP);
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("DVD");
		menuBar.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Computer");
		menuBar.add(mntmNewMenuItem_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(0, 70, 760, 30);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Suchergebnisse f\u00FCr .....");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(10, 0, 294, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("WK");
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setBackground(Color.YELLOW);
		lblNewLabel_3_1.setBounds(694, 0, 30, 30);
		panel.add(lblNewLabel_3_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 738, 349);
		frame.getContentPane().add(scrollPane);
		
		
		int amountProducts = 10;
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(amountProducts, 0, 0, 0));
		
		for(int i =0;i<amountProducts;i++) {
			panel_1.add(new ProductOverview("TEST " + i," More Test"));
		}
		

	}
}
