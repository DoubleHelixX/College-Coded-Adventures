package skateboarddesigner;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Wheels extends JPanel{
private JLabel wheelsLabel;
private JComboBox combo1;
private String [] items = {"51 mm $20", "55 mm $22", "58 mm $24", "61 mm $28"};

	public Wheels() 
	{
		buildPanel();
	}

	private void buildPanel()
	{
		wheelsLabel = new JLabel("Chose your Wheels: ");
		add(wheelsLabel);
		wheelsLabel.setOpaque(false);
		wheelsLabel.setHorizontalAlignment (JLabel.CENTER);
		combo1 = new JComboBox(items);
		add(combo1);
		combo1.setOpaque(false);
		setBackground(Color.WHITE);
		
	}
	
	public Integer getWheelPrice()
	{
		if (combo1.getSelectedItem().equals(items[0]))
			return 	20;
		else if (combo1.getSelectedItem().equals(items[1]))
			return	22;
		else if (combo1.getSelectedItem().equals(items[2]))
			return	24;
		else if (combo1.getSelectedItem().equals(items[3]))
			return	28;
		
		else return 999;
	}
}