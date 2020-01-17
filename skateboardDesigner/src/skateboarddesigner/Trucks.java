package skateboarddesigner;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Trucks extends JPanel{
private JLabel truckLabel;
private JComboBox combo1;
private String [] items = {"7.75-inch axle: $35", "8-inch axle: $40", "8.5-inch axle $45"};

	public Trucks() 
	{
		buildPanel();
	}

	private void buildPanel()
	{
		truckLabel = new JLabel("Chose Truck Assemblies: ");
		add(truckLabel);
		truckLabel.setHorizontalAlignment (JLabel.CENTER);
		truckLabel.setOpaque(false);
		combo1 = new JComboBox(items);
		add(combo1);
		combo1.setOpaque(false);
		setBackground(Color.WHITE);
	}
	public Integer getTrunkPrice()
	{
		if (combo1.getSelectedItem().equals(items[0]))
			return 	35;
		else if (combo1.getSelectedItem().equals(items[1]))
			return	40;
		else if (combo1.getSelectedItem().equals(items[2]))
			return	45;
		else return 999;
	}
}