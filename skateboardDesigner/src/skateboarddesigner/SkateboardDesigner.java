/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skateboarddesigner;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SkateboardDesigner extends JFrame implements ActionListener{
    private int WINDOW_WIDTH =300, WINDOW_HEIGHT = 300;
    private JLabel title;
    private JButton calc, exit;
    private JPanel buttonPanel;
    private final double tax=0.06;
    private double subTotal=0.00, subTaxed =0.00, total =0.00;
    private NumberFormat formatter;
    private Decks deck;
    private Trucks truck;
    private Wheels wheel;
    private Miscellaneous misc;
    private JPanel basePanel;
    
    public SkateboardDesigner()
    {
        setDefaults();
        buildFrame();
        pack();
    }
    private void setDefaults() 
    {
            // Set the window title.
       setTitle("Order Calc Thomas Rivera");

       // Set the size of the window.
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

       // Specify what happens when the close button is clicked.
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // Display the window.
       setVisible(true);
    }
    
       
    private void buildFrame()
    {
     formatter = new DecimalFormat("#0.00"); 
     getContentPane().setLayout(new BorderLayout());
     getContentPane().setBackground(Color.WHITE);
     basePanel = new JPanel(new BorderLayout());
     add(basePanel, BorderLayout.CENTER);
     basePanel.setBackground(Color.WHITE);
     title = new JLabel("Skateboard Designer");
     title.setHorizontalAlignment (JLabel.CENTER);
     title.setFont(new Font("Calligrapher", Font.BOLD, 24));
     title.setOpaque(false);
     basePanel.add(title, BorderLayout.NORTH);
     basePanel.add(deck = new Decks(), BorderLayout.WEST);
     basePanel.add(truck = new Trucks(), BorderLayout.CENTER);
     basePanel.add(wheel = new Wheels(), BorderLayout.EAST);
     basePanel.add(misc = new Miscellaneous(), BorderLayout.SOUTH);
     
     buttonPanel= new JPanel();
     add(buttonPanel, BorderLayout.SOUTH);
	 calc = new JButton("Calculate");
	 calc.addActionListener(this);
	 exit = new JButton("EXIT");
	 exit.addActionListener(this);
	 buttonPanel.add(calc);
	 buttonPanel.add(exit);
	 buttonPanel.setBackground(Color.WHITE);
     
    }
    
    public static void main(String[] args) 
    {
       new SkateboardDesigner();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
    	int subtotal = (deck.getDeckPrice() + truck.getTrunkPrice() + wheel.getWheelPrice() + misc.getMiscPrice());
		double total = tax*subtotal+subtotal;
		if (e.getSource().equals(calc))
		{
			JOptionPane.showMessageDialog(null,"SubTotal: $" + formatter.format(subtotal) + "\n Taxed Amount: $" + 
					formatter.format(tax*subtotal) + " \n Total: $" +
					formatter.format(total));
			
		}
		else if (e.getSource().equals(exit))
		{
			System.exit(0);
		}
		
	
    }
    
    
}
