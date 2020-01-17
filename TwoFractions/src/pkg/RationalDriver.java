package pkg;
import java.util.Scanner;
public class RationalDriver 
{
	private Scanner sc;
	private Rational r;  
	private int input,choice;
	private int[] myArray = new int [4];

	public RationalDriver() 
	{
		sc= new Scanner(System.in);
		askForFraction(sc);
		askPrecision(sc);
		r = new Rational(myArray [0],myArray [1],myArray [2],myArray [3]);
		r.setPrecision(input);
		while(true)
		{mainMenu(sc);}
		
	}

	
	public void askForFraction(Scanner sc)
	{
		System.out.println("Enter Numerator #1: ");
		myArray[0]=sc.nextInt();
		System.out.println("Enter Denominator #1: ");
		myArray[1]=sc.nextInt();
		System.out.println("Enter Numerator #2: ");
		myArray[2]=sc.nextInt();
		System.out.println("Enter Denominator #2: ");
		myArray[3]=sc.nextInt();
		
	}
	public void mainMenu(Scanner sc)
	{
		System.out.println("\n\n 1: ADD \n 2: Subtract \n 3: Multiply \n 4: Divide \n 5: Exit");
		choice = sc.nextInt();
		switch (choice) 
		{
        case 1:  r.convertToFractions(choice);
        		 r.printList(choice);
                 break;
        case 2:  r.convertToFractions(choice);
        		 r.printList(choice);
                 break;
        case 3:  r.convertToFractions(choice);
        		 r.printList(choice);
                 break;
        case 4:  r.convertToFractions(choice);
        	     r.printList(choice);
        		break;
        case 5: System.out.println("Exiting ... Goodbye");
        		System.exit(0);
        		break;
		}
		
	}
	
	public void askPrecision(Scanner sc)
	{
		System.out.println("Enter Precision (Amount of digits shown after the decimal): ");
		input=sc.nextInt();
	}
	
	public static void main (String[] args)
	{
		new RationalDriver();
	}
}
