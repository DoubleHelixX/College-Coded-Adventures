package candies;

public class Dispenser  {
	private int candy,chips,gum,cookies;
	private final double chipsCost=0.75 ,cookiesCost =1.75, gumCost=0.25, candyCost=0.55;
	private double finalChange;
	private boolean indicator = true;
	public Dispenser()
	{
		candy=5;
		chips=3;
		gum=1;
		cookies=7;
		
	}
	
	public void compareItems(int choice)
	{
		switch (choice)
		{
		case 1: if (candy==0)
				{
				System.out.println("No more Candy in the machine . . . ");
				indicator = false;
				}
				else  indicator = true;
				break;
		
		case 2: if (chips==0) 
				{ 
				System.out.println("No more chips in the machine . . . ");
				indicator = false;
				}
				else indicator = true;
				break;
		
		case 3: if (gum==0) 
				{
				System.out.println("No more gum in the machine . . . ");
				indicator = false;
				}
				else indicator = true;
				break;
		
		case 4: if (cookies==0) 
				{
				System.out.println("No more cookies in the machine . . . ");
				indicator = false;
				}
				else indicator = true;
				break;
		}
	}
	
	public void Processing(int choice)
	{
		switch (choice)
		{
		case 1:  decrementCandy();
				 System.out.println("Processing . . . \n There are now: " + getCandy() + " Candy pieces left in the vending machine");
				 break;
		
		case 2: decrementChips();
				System.out.println("Processing . . . \n There are now: " + getChips() + " Chips left in the vending machine");
				break;
		
		case 3: decrementGum();
				System.out.println("Processing . . . \n There are now: " + getGum() + " Gum left in the vending machine");
				break;
		
		case 4: decrementCookies();
				System.out.println("Processing . . . \n There are now: " + getCookies() + " Cookies left in the vending machine"); 
				break;
		}
	}
	
	public Boolean getIndicator()
	{
		return indicator;
	}
	
	public int getCandy()
	{
		return candy;
	}

	public int getChips()
	{
		return chips;
	}
	
	public int getGum()
	{
		return gum;
	}
	
	public int getCookies()
	{
		return cookies;
	}
	
	public double getCandyCost()
	{
		return candyCost;
	}

	public double getChipsCost()
	{
		return chipsCost;
	}
	
	public double getGumCost()
	{
		return gumCost;
	}
	
	public double getCookiesCost()
	{
		return cookiesCost;
	}
	public void decrementCandy()
	{
		--candy;
	}
	
	public void decrementChips()
	{
		--chips;
	}
	
	public void decrementGum()
	{
		--gum;
	}
	
	public void decrementCookies()
	{
		--cookies;
	}
}
