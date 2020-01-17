package skateboarddesigner;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Decks extends JPanel{
private JLabel deckLabel;
private JComboBox combo1;
private String [] items = {"The Master Thrasher: $60", "The Dictator: $45", "The Street King: $50"};

	public Decks() 
	{
		buildPanel();
	}

	private void buildPanel()
	{
		deckLabel = new JLabel("Chose A Deck: ");
		deckLabel.setOpaque(false);
		add(deckLabel);
		deckLabel.setHorizontalAlignment (JLabel.CENTER);
		combo1 = new JComboBox(items);
		add(combo1);
		combo1.setOpaque(false);
		setBackground(Color.WHITE);
		
	}
	
	public Integer getDeckPrice()
	{
		if (combo1.getSelectedItem().equals(items[0]))
			return 	60;
		else if (combo1.getSelectedItem().equals(items[1]))
			return	45;
		else if (combo1.getSelectedItem().equals(items[2]))
			return	50;

		else return 999;
		
	}
	
}

