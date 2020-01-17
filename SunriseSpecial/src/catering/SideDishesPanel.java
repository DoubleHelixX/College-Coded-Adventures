package catering;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SideDishesPanel extends JPanel{
	private JCheckBox salad, veggies, potatoes, rice, beans, bread;
	private JLabel title;
	private double finalPrice = 0.0;
	
	public SideDishesPanel()
	{
		buildPanel();
	}
	
	private void buildPanel()
	{
		setLayout(new GridLayout(7,1));  // could also use the Box class to set the buttons vertically
		salad = new JCheckBox("Salad $6.50");
		veggies = new JCheckBox("Mixed Veggies $9.50");
		potatoes = new JCheckBox("Potatoes $5.50");
		rice = new JCheckBox("Rice Dishes $7.75");
		beans = new JCheckBox("Beans $6.75");
		bread = new JCheckBox("Bread $4.00");
		
		title = new JLabel("SIDE DISHES");
		title.setHorizontalAlignment(JLabel.CENTER);
		
		add(title);
		add(salad);
		add(veggies);
		add(potatoes);
		add(rice);
		add(beans);
		add(bread);
		
		title.setOpaque(false);
		salad.setOpaque(false);
		veggies.setOpaque(false);
		potatoes.setOpaque(false);
		rice.setOpaque(false);
		beans.setOpaque(false);
		bread.setOpaque(false);
		
		
		
		setBackground(Color.ORANGE); // NOT WORKING ???
	}
	public double getSideDishPrice()
	{
		finalPrice=0;
		if(salad.isSelected())
			finalPrice+= 6.50;
		if (veggies.isSelected())
			finalPrice+= 9.50;
		if (potatoes.isSelected())
			finalPrice+= 5.50;
		if (rice.isSelected())
			finalPrice+= 7.75;
		if (beans.isSelected())
			finalPrice+= 6.75;
		if (bread.isSelected())
			finalPrice+= 4.00;
		return finalPrice;
	}
}
	
	