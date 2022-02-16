package prototyp2;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

public class ProductOverview extends JPanel {

	private JLabel lblProductPicture;
	private JLabel lblProductText;
	
	
	/**
	 * Create the panel.
	 */
	public ProductOverview() {
		setBorder(new TitledBorder(null, "Mein Titel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setPreferredSize(new Dimension(720, 95));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{120, 0, 110,0 };
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		lblProductPicture = new JLabel("New label");
		lblProductPicture.setBackground(Color.ORANGE);
		lblProductPicture.setOpaque(true);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblProductPicture, gbc_lblNewLabel);
		
		lblProductText = new JLabel("New label");
		lblProductText.setOpaque(true);
		lblProductText.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 0;
		add(lblProductText, gbc_lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Warenkorb");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);
	}

	public ProductOverview(String pictureText,String productText){
		this();
		this.lblProductPicture.setText(pictureText);
		this.lblProductText.setText(productText);
		setBorder(new TitledBorder(null, pictureText, TitledBorder.LEADING, TitledBorder.TOP, null, null));
	}
	
	public ProductOverview(Icon icon,String productText){
		this();
		this.lblProductPicture.setIcon(icon);
		this.lblProductText.setText(productText);
	}
}
