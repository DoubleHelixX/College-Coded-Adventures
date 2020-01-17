package candies;



public class CashRegister extends customer{
	private double cash;
	public CashRegister()
	{
		super();
		cash=300.0;
		compareCash();
	}
	
	public CashRegister(double c)
	{
		super();
		cash=c;
		compareCash();
	
			//cash-=super.getCash();
		
	}
	
	public void compareCash()
	{
		if(super.getCashInvetory() < -300)
		{
			System.err.println("Not Enough Money in the Register ... please Reload Register");
			System.exit(0);
		}
		else
		{
			cash+=super.getCashInvetory();
			System.err.println("Current Cash in the Register is $" + cash);
		}
			
			
	}
	
	public static void main (String[] args)
	{
		new CashRegister();
	}

}
