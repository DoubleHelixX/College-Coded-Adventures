package catering;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MainDishPanel extends JPanel{
	private JRadioButton meatLoaf, bbqChicken, salmon, pasta;
	private ButtonGroup group1;
	private JLabel title;

	public MainDishPanel() 
	{
		buildPanel();
		
		
	}

	private void buildPanel()
	{
		setLayout(new GridLayout(5,1));  // could also use the Box class to set the buttons vertically
		meatLoaf = new JRadioButton("Beef_Meat_Loaf $70.00");
		bbqChicken = new JRadioButton("BBQ Chicken_Pieces $60.00");
		salmon = new JRadioButton("Grilled_Salmon $20.00");
		pasta = new JRadioButton("Pasta_Prime_Vera $40.00");
		title = new JLabel("MAIN DISHES");
		title.setHorizontalAlignment(JLabel.CENTER);
		
		add(title);
		add(meatLoaf);
		add(bbqChicken);
		add(salmon);
		add(pasta);
		
		title.setOpaque(false);
		meatLoaf.setOpaque(false);
		bbqChicken.setOpaque(false);
		salmon.setOpaque(false);
		pasta.setOpaque(false);
		
		group1 = new ButtonGroup();
		group1.add(meatLoaf);
		group1.add(bbqChicken);
		group1.add(salmon);
		group1.add(pasta);
		
		setBackground(Color.RED); // NOT WORKING ???
	}
	
	public double getMainDishPrice()
	{
		if(meatLoaf.isSelected())
		return 70.00;
		else if (bbqChicken.isSelected())
			return 60.00;
		else if (salmon.isSelected())
			return 20.00;
		else if (pasta.isSelected())
			return 40.00;
		return 0;
	}
	
}
