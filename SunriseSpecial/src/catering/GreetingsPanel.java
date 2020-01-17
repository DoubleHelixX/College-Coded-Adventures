package catering;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class GreetingsPanel extends JFrame implements ActionListener {
	private int WINDOW_WIDTH =300, WINDOW_HEIGHT = 300;
	private JLabel title;
	private JButton calc, exit;
	private MainDishPanel mainDish;
	private SideDishesPanel sideDish;
	private DessertsPanel dessert;
	private JPanel buttonPanel;
	private final double tax=0.06;
	private  NumberFormat formatter ;
	public GreetingsPanel()
	{
		formatter = new DecimalFormat("#0.00");
		setDefaults();
		buildFrame();
		pack();
		
		
	}
	
	private void setDefaults() 
    {
            
       setTitle("Order Calc Thomas Rivera");

       
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

      
       setVisible(true);
       
    }
	
	private void buildFrame()
	{
		 getContentPane().setLayout(new BorderLayout());
		 getContentPane().setBackground(Color.WHITE);
		 title = new JLabel("Sunrise Specialty Catering");
		 title.setHorizontalAlignment (JLabel.CENTER);
		 title.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		 
		 add(title, BorderLayout.NORTH);
		 add(mainDish = new MainDishPanel() ,BorderLayout.WEST);
		 add(sideDish = new SideDishesPanel() ,BorderLayout.CENTER);
		 add(dessert = new DessertsPanel() ,BorderLayout.EAST);
		 
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double subtotal = (mainDish.getMainDishPrice() + sideDish.getSideDishPrice() + dessert.getDessertPrice());
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
	
	public static void main(String[] args) 
	    {
	        new GreetingsPanel();
	    }

	
	

}
