package catering;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class DessertsPanel extends JPanel{

	private JRadioButton no_dessert, chocolate_cake, Apple_pie, ButterScotchPudding;
	private ButtonGroup group1;
	private JLabel title;

	public DessertsPanel() 
	{
		buildPanel();
		
	}

	private void buildPanel()
	{
		setLayout(new GridLayout(5,1));  // could also use the Box class to set the buttons vertically
		no_dessert = new JRadioButton("none $0.00");
		chocolate_cake = new JRadioButton("Chocolate Cake $2.25");
		Apple_pie = new JRadioButton("Apple Pie $1.50");
		ButterScotchPudding = new JRadioButton("ButterScotch Pudding $2.50");
		title = new JLabel("Desserts");
		title.setHorizontalAlignment(JLabel.CENTER);
		
		add(title);
		add(no_dessert);
		add(chocolate_cake);
		add(Apple_pie);
		add(ButterScotchPudding);
		
		title.setOpaque(false);
		no_dessert.setOpaque(false);
		chocolate_cake.setOpaque(false);
		Apple_pie.setOpaque(false);
		ButterScotchPudding.setOpaque(false);
		
		group1 = new ButtonGroup();
		group1.add(no_dessert);
		group1.add(chocolate_cake);
		group1.add(Apple_pie);
		group1.add(ButterScotchPudding);
		
		setBackground(Color.cyan); // NOT WORKING ???
	}
	
	public double getDessertPrice()
	{
		if(no_dessert.isSelected())
		return 0.00;
		else if (chocolate_cake.isSelected())
			return 2.25;
		else if (Apple_pie.isSelected())
			return 1.50;
		else if (ButterScotchPudding.isSelected())
			return 2.50;
		return 0;
	}
	
}