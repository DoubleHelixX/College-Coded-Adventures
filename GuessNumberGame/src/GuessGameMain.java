import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class GuessGameMain extends JFrame implements DocumentListener
{
	private int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 500;
	private JLabel displayLb;
	private JTextField inputFld;
	private JPanel frontPnl;
	private JButton btn;
	private Random rand;
	private int ran1;
	
	public GuessGameMain() 
	{
		rand = new Random();
		createRanNum();
		buildPanel();
		pack();
		setDefaults();
	}
	
	private void createRanNum()
	{
		ran1 = rand.nextInt(1000);
		if (ran1 ==0)
			ran1 = rand.nextInt(1000);
	}
	
	private void setDefaults() 
    {
            
       setTitle("Guessing Game, Thomas Rivera");
       setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true); 
    }
	
	private void buildPanel()
	{
		frontPnl = new JPanel();
		frontPnl.setBackground(Color.WHITE);
		((JComponent) getContentPane()).setBorder(BorderFactory.createTitledBorder("Guess Number Game"));
		//frontPnl.setBorder(BorderFactory.createTitledBorder("Guess Number Game"));
		add(frontPnl, BorderLayout.CENTER);
		displayLb = new JLabel("Enter a Number from 1-1000: ");
		displayLb.setFont(new Font("Times New Roman" , Font.BOLD, 24));
		inputFld = new JTextField(4);
		inputFld.getDocument().addDocumentListener(this);
		frontPnl.add(displayLb);
		frontPnl.add(inputFld);
		btn= new JButton("Restart Game? ");
		btn.addActionListener(new ActionListener() {     
            public void actionPerformed(ActionEvent e) {
            	createRanNum();
            	inputFld.setText("");
            	inputFld.setEditable(true);
            }
        });
		
		frontPnl.add(btn, BorderLayout.SOUTH);
		
		
	}
	
	 public static void main(String args[]) 
	    { 
	         new GuessGameMain(); 
	      
	    }

	@Override
	public void changedUpdate(DocumentEvent e) {
		testGuess();
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		testGuess();
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		testGuess();
		
	} 
	
	private void testGuess()
	{
		if (inputFld.getText().equals(""))
		{
			frontPnl.setBackground(Color.WHITE);
			displayLb.setText("Enter a Number from 1-1000: ");
		}
		else
		{
			if(Integer.parseInt(inputFld.getText()) == ran1)
			{
				frontPnl.setBackground(Color.YELLOW);
				displayLb.setText("HOORAYY YOU WON !");
				inputFld.setEditable(false);
			}
			else if (Integer.parseInt(inputFld.getText()) > ran1)
			{
				frontPnl.setBackground(Color.RED);
				displayLb.setText("Too High ! ");
			}
			else if (Integer.parseInt(inputFld.getText()) < ran1)
			{
				frontPnl.setBackground(Color.BLUE);
				displayLb.setText("Too Low ! ");
			}
		}
		
	
		}
	

}
