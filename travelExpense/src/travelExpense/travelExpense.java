package travelExpense;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.*;


public class travelExpense extends JFrame implements ActionListener
{
	private JPanel basePanel, borderPanel, displayPanel, resultPanel, buttonPanel;
	private JLabel titleLabel,daysOnTripLabel, airfareLabel, rentalFeesLabel, milesDrivenLabel, parkingFeesLabel, taxiChargesLabel, registrationFeesLabel, lodgingChargesLabel;
	private JLabel totalExpenseLabel,totalAllowableLabel,excessLabel,savingsLabel;
	private JTextField daysOnTripTF, airfareTF, rentalFeesTF, milesDrivenTF, parkingFeesTF, taxiChargesTF, registrationFeesTF, lodgingChargesTF;
	private JTextField totalExpenseTF,totalAllowableTF,excessTF,savingsTF;
	private JButton calcBTN, resetBTN;
	private final double mealReimbursement = 37.00, parkingFeeReimbursement = 10.00, taxiReimbursement = 20.00, lodgingReimbursement = 95.00, vehicleReimbursement = 0.27, dollarPerMile=1.00;
	private final int WINDOW_WIDTH = 400, WINDOW_HEIGHT = 320;
	private NumberFormat formatter = new DecimalFormat("#0.00");    
	/*
	 *  POSSIBLE FUTURE USES TO SET DATA OF PAST ENTRIES
	 * private int daysOnTripEntry = 0;
	 * private double airfareEntry, rentalFeesEntry, milesDrivenEntry, parkingFeesEntry, taxiChargesEntry, registrationFeesEntry, lodgingChargesEntry;
	 */
	
	travelExpense() 
	{
		setDefaults();
		buildPanel();
		pack();
	}
	
	private void setDefaults() {
		 // Set the window title.
	    setTitle("Travel Expense by: Thomas Rivera");

	    // Set the size of the window.
	    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	    // Specify what happens when the close button is clicked.
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    // Display the window.
	    setVisible(true);
	    
		}
		
	private void buildPanel()
	{
		basePanel = new JPanel(new BorderLayout());
		add(basePanel);
		titleLabel = new JLabel("Travel Expense Caclulator");
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		basePanel.add(titleLabel, BorderLayout.NORTH);
		borderPanel = new JPanel(new BorderLayout ());
		basePanel.add(borderPanel, BorderLayout.CENTER);
		displayPanel = new JPanel(new GridLayout (8,2));
		borderPanel.add(displayPanel, BorderLayout.NORTH);
		
		daysOnTripLabel = new JLabel("Number of Days on Trip:");
		airfareLabel = new JLabel("Amount of Airfare:");
		rentalFeesLabel = new JLabel("Amount of car rental fees:   ");
		milesDrivenLabel = new JLabel("Number of Miles Driven:");
		parkingFeesLabel = new JLabel("Amount of parking fees:");
		taxiChargesLabel = new JLabel("Amount of taxi charges: ");
		registrationFeesLabel = new JLabel("Registration Fees: ");
		lodgingChargesLabel = new JLabel("Lodging Charges:");
		
		daysOnTripTF = new JTextField();
		airfareTF = new JTextField();
		rentalFeesTF = new JTextField();
		milesDrivenTF = new JTextField();
		parkingFeesTF = new JTextField();
		taxiChargesTF = new JTextField();
		registrationFeesTF = new JTextField();
		lodgingChargesTF = new JTextField();
		
		displayPanel.add(daysOnTripLabel);
		displayPanel.add(daysOnTripTF);
		displayPanel.add(airfareLabel);
		displayPanel.add(airfareTF);
		displayPanel.add(rentalFeesLabel);
		displayPanel.add(rentalFeesTF);
		displayPanel.add(milesDrivenLabel);
		displayPanel.add(milesDrivenTF);
		displayPanel.add(parkingFeesLabel);
		displayPanel.add(parkingFeesTF);
		displayPanel.add(taxiChargesLabel);
		displayPanel.add(taxiChargesTF);
		displayPanel.add(registrationFeesLabel);
		displayPanel.add(registrationFeesTF);
		displayPanel.add(lodgingChargesLabel);
		displayPanel.add(lodgingChargesTF);
		
		calcBTN = new JButton("Calculate");
		resetBTN = new JButton("Reset");
		
		//adding the buttons on grid panel then placing that panel in the center of the border panel
		buttonPanel = new JPanel(new GridLayout(1,2));
		buttonPanel.add(resetBTN);
		buttonPanel.add(calcBTN);
		borderPanel.add(buttonPanel, BorderLayout.CENTER);
		
		calcBTN.addActionListener(this);
		resetBTN.addActionListener(this);
			
		resultPanel = new JPanel(new GridLayout(4,2));
		borderPanel.add(resultPanel, BorderLayout.SOUTH);
		totalExpenseLabel = new JLabel("Total Expense Incurred: ");
		totalAllowableLabel = new JLabel("Total Allowable: ");
		excessLabel = new JLabel("Excess Amount: ");
		savingsLabel = new JLabel("Trip Savings: ");
		
		totalExpenseTF = new JTextField();
		totalAllowableTF = new JTextField();
		excessTF = new JTextField();
		savingsTF = new JTextField();
		totalExpenseTF.setEditable(false);
		totalAllowableTF.setEditable(false);
		excessTF.setEditable(false);
		savingsTF.setEditable(false);
		
		
		resultPanel.add(totalExpenseLabel);
		resultPanel.add(totalExpenseTF);
		resultPanel.add(totalAllowableLabel);
		resultPanel.add(totalAllowableTF);
		resultPanel.add(excessLabel);
		resultPanel.add(excessTF);
		resultPanel.add(savingsLabel);
		resultPanel.add(savingsTF);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{ 
		if (e.getSource() == calcBTN)
		{
			//INPUT VALIDATION FOR TFs
			while ( daysOnTripTF.getText() == null || daysOnTripTF.getText().trim().isEmpty() || (Double.parseDouble(daysOnTripTF.getText())) <1)
			{
				String error1 = JOptionPane.showInputDialog("ERROR Days on Trip TextField must not be empty or be $0.00");
				if(error1.length() >0)
					daysOnTripTF.setText(error1);
			
			}
			
			while ( lodgingChargesTF.getText() == null || lodgingChargesTF.getText().trim().isEmpty() || (Double.parseDouble(lodgingChargesTF.getText())) <= 0)
			{
				String error2 = JOptionPane.showInputDialog("ERROR lodging Charges TextField must not be empty or be $0.00");
				if(error2.length() >0)
					lodgingChargesTF.setText(error2);
			}
			
			//MORE INPUT VALIDATIONS 
			if ( airfareTF.getText() == null || airfareTF.getText().trim().isEmpty())
				airfareTF.setText("0");
			
			if ( rentalFeesTF.getText() == null || rentalFeesTF.getText().trim().isEmpty())
				rentalFeesTF.setText("0");
			
			if ( milesDrivenTF.getText() == null || milesDrivenTF.getText().trim().isEmpty())
				milesDrivenTF.setText("0");
			
			if ( parkingFeesTF.getText() == null || parkingFeesTF.getText().trim().isEmpty())
				parkingFeesTF.setText("0");
			
			if ( taxiChargesTF.getText() == null || taxiChargesTF.getText().trim().isEmpty())
				taxiChargesTF.setText("0");
			
			if ( registrationFeesTF.getText() == null || registrationFeesTF.getText().trim().isEmpty())
				registrationFeesTF.setText("0");
				
				
			
			double mealsSaving = (Double.parseDouble(daysOnTripTF.getText()) * mealReimbursement);
			//System.err.println((formatter.format(mealsSaving)));
			double parkingSaving = (Double.parseDouble(daysOnTripTF.getText()) * parkingFeeReimbursement );
			//System.err.println((formatter.format(parkingSaving)));
			double taxiSaving = (Double.parseDouble(daysOnTripTF.getText()) * taxiReimbursement );
			//System.err.println((formatter.format(taxiSaving)));
			double lodgingSaving = (Double.parseDouble(daysOnTripTF.getText()) * lodgingReimbursement );
			//System.err.println((formatter.format(lodgingSaving)));
			double milesSaving = (Double.parseDouble(milesDrivenTF.getText()) * vehicleReimbursement );
			//System.err.println((formatter.format(milesSaving)));
			
			double totalExpense = ((Double.parseDouble(airfareTF.getText())) + (Double.parseDouble(rentalFeesTF.getText())) + (Double.parseDouble(milesDrivenTF.getText()) * dollarPerMile) + (Double.parseDouble(parkingFeesTF.getText())) + (Double.parseDouble(taxiChargesTF.getText()))
					+ (Double.parseDouble(registrationFeesTF.getText())) + (Double.parseDouble(lodgingChargesTF.getText())));
			totalExpenseTF.setText("$" + formatter.format(totalExpense));		
			
			double totalAllowable = mealsSaving + parkingSaving + taxiSaving + lodgingSaving + milesSaving;
			totalAllowableTF.setText("$" + formatter.format(totalAllowable));
			
			if (totalExpense > totalAllowable)
			excessTF.setText("$" + formatter.format(totalExpense - totalAllowable));
			else if (totalExpense < totalAllowable)
				savingsTF.setText("$" + formatter.format( totalAllowable - totalExpense));
			else 
			{
				excessTF.setText("$ 0.00");
				savingsTF.setText("$ 0.00");
			}
		
			
			/*
			 * I FOUND A ERROR IN THE COMPANYS INITAL GUI SETUP INTERPRETATION... FOR INSTANCE IF YOU HAVE 10 A DAY FOR PARKING FOR 1 DAY THATS 20 DOLLARS MAX AND LETS SAY YOU ONLY SPENT 8 DOLLARS FOR THOSE TWO DAYS
			 * THEN THAT SHOULD REIMBURSE THOSE FEES BUT THE EXCESS MONEY CANNOTTTTT AND I REPEAT CANNOT BE USED FOR ANY OTHER EXPENSES - ITS ONLY FOR PARKING FEES - SO THEREFOR
			 * I FEEL THERES A SLIGHT ERROR IN HOW WE PERCIEVE HOW MUCH THE CLIENT REALLY DOES SAVE IN TOTAL.
			 * 
			// test whether its below the reimbursement rate and if it is then the charges are set to zero otherwise deduct the reimbursement from it
			if (parkingSaving > (Double.parseDouble(parkingFeesTF.getText())))
			{
				
			}
			else
			{
			
			}
			
			*/
			
		}
		else if (e.getSource() == resetBTN)
		{
			daysOnTripTF.setText("");
			airfareTF.setText("");
		    rentalFeesTF.setText("");
		    milesDrivenTF.setText("");
			parkingFeesTF.setText("");
			taxiChargesTF.setText("");
			registrationFeesTF.setText("");
			lodgingChargesTF.setText("");
			totalExpenseTF.setText("");
			totalAllowableTF.setText("");
			excessTF.setText("");
			savingsTF.setText("");
		}
		
		
	}
	
	
	public static void main(String[] args) 
	{
		new travelExpense();

	}

}
