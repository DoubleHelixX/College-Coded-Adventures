package candies;
import java.util.Scanner;
public class customer extends Dispenser {
	private Scanner sc;
	private int num;
	private double customerCash, cashInventory ;
	
	public customer()
	{
		super();
		greeting();
		sc = new Scanner(System.in);
		while(super.getIndicator()==true) 
		{
			choices();
			super.compareItems(num);
			if(super.getIndicator()==true)
			{
			showItemCost();
			super.Processing(num);
			goodbyeMessage();
			}
			
		}
	}
	
	private void greeting()
	{
		System.out.println("*** Welcome to Shelly's Candy Shop ***");
	}
	private void choices()
	{
		while(true) 
		{
		System.out.println("Press '1' for Candy\nPress '2' for Chips\nPress '3' for Gum\nPress '4' for Cookies\nPress '9' for Exit");
		num=sc.nextInt();
		if(num <1 || (num >4 && num!=9))
		{
			System.out.println("Error invalid choice");
		}
		else
			break;
		}
		
	}

	private void showItemCost()
	{
		switch (num)
		{
		case 1: System.out.println("Please Deposit " + "$"+ super.getCandyCost()); 
				insertCash(super.getCandyCost());
		break;
		case 2: System.out.println("Please Deposit " + "$"+ super.getChipsCost());  
				insertCash(super.getChipsCost());
		break;
		case 3: System.out.println("Please Deposit " +"$"+super.getGumCost()); 
				insertCash(super.getGumCost());
		break;
		case 4: System.out.println("Please Deposit " + "$"+ super.getCookiesCost());  
				insertCash(super.getCookiesCost());
		break;
		default: System.out.println("Exiting. . . Goodbye"); 
				 System.exit(0);
		break;
		}
	}
	public void goodbyeMessage()
	{
		System.out.print("Thank you for purchasing a snack... " + getChange() + "\n");
	}
	public String getChange()
	{
		return "Your Current Change is " + customerCash;
	}
	public double getCashInvetory()
	{
		return cashInventory;
	}
	public void insertCash(double cost)
	{
		while(true) 
		{
		System.out.println("Insert Cash now: ");
		customerCash=sc.nextDouble();
		if(cost>customerCash) 
			{
			cost = cost-customerCash;
			System.out.println("Please insert: $" + cost + " more.");
			cashInventory+=customerCash;
			}
		else if(customerCash>cost)
		{
			customerCash = customerCash-cost;
			cashInventory+=cost;
			break;
			
		}
		else if (cost==customerCash) {
			cashInventory+=customerCash;
			break;
		}
		else
			{
			System.out.println("ERROR insertcash method");
			System.exit(0);
			}
		}
	}
	
	public int getChoice()
	{
		return num;
	}
}
