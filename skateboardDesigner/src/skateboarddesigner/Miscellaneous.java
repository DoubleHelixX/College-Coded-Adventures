package skateboarddesigner;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Miscellaneous extends JPanel{
private JLabel miscLabel;
private int finalPrice=0;
private JCheckBox gripTapes, bearings, riserPads, nutsBoltsKit;

	public Miscellaneous() 
	{
		buildPanel();
	}

	private void buildPanel()
	{
		miscLabel = new JLabel("Miscellaneous Products and Services: ");
		add(miscLabel);
		miscLabel.setHorizontalAlignment (JLabel.CENTER);
		//Create Checkboxes
		gripTapes = new JCheckBox("Grip-Tapes $10");
		bearings = new JCheckBox("Bearings $30");
		riserPads = new JCheckBox("Riser Pads $2");
		nutsBoltsKit = new JCheckBox("nuts and Bolts Kit $3");
		
		//Add Checkboxes
		add(gripTapes);
		add(bearings);
		add(riserPads);
		add(nutsBoltsKit);
		
		gripTapes.setOpaque(false);
		bearings.setOpaque(false);
		riserPads.setOpaque(false);
		nutsBoltsKit.setOpaque(false);
		setBackground(Color.WHITE);
		
	}
	public Integer getMiscPrice()
	{
		finalPrice=0;
		if(gripTapes.isSelected())
			finalPrice+= 10;
		if (bearings.isSelected())
			finalPrice+= 30;
		if (riserPads.isSelected())
			finalPrice+= 2;
		if (nutsBoltsKit.isSelected())
			finalPrice+= 3;
		return finalPrice;
	}
}