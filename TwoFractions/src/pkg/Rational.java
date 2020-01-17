package pkg;
//import java.math.BigDecimal;

public class Rational 
{
	private int numerator,denominator,numerator2,denominator2,precision,n3,d3,n4,d4,n5,d5,n6,d6;
	private String value,frac;
	private String [] fraction = new String [4]; 
	private double num1,num2,den1,den2;
	//private BigDecimal bigDecimal; 

	public Rational() 
	{
		numerator=50;
		denominator=150;
		numerator2=56;
		denominator2=22;
		intToDouble();
		simplify(numerator,denominator,numerator2,denominator2);
		//setBackToFractions();
	}
	public Rational(int n, int d,int n2, int d2) 
	{
		numerator=n;
		denominator=d;
		numerator2=n2;
		denominator2=d2;
		intToDouble();
		simplify(numerator,denominator,numerator2,denominator2);
		//setBackToFractions();
	}
	
	public void intToDouble()
	{
		num1=numerator*1.0;
		num2=numerator2*1.0;
		den1=denominator*1.0;
		den2=denominator2*1.0;
		
	}
	
	public void setPrecision(int p)
	{
		precision=p;
	}
	
	
	public double addFractions()
	{
		double result= ((num1*den2)+(den1*num2)) / (den1*den2); //  a/b + c/d = (ad+bc)/bd 	
		return result;
	}
	
	public double subtractFractions()
	{
		double result= ((num1*den2)-(den1*num2)) / (den1*den2); //  a/b - c/d = (ad-bc)/bd 	
		return result;
	}
	public double divideFractions()
	{
		double result= ((num1*den2)/(den1*num2)); //  ab/cd=ad/bc
		return result;
	}
	public double multiplyFractions()
	{
		double result= ((num1*num2)/(den1*den2)); //  ab×cd=ac/bd
		return result;
	}
	
	public String simplify(int n, int d) 
	{
	    int gcf = gcf(n, d);
	   return d == 0 ? (""+ (n)) : (n / gcf) + "/" + (d / gcf);
	    
	}
	
	public void simplify(int n, int d, int n2, int d2) 
	{
		//Simplifying both fractions separately 
	    if ((d*d2) !=0)
		    {
	    	int gcf = gcf((n*d2)+(d*n2), (d*d2));
		    n5=(((n*d2)+(d*n2)) / gcf);
		    d5=((d*d2) / gcf);
		    }
	       if (d5==0||d5==1)
	       fraction[0]= Integer.toString(n5);
	    
	     if ((d*d2) !=0)
		    {
		    	int gcf = gcf((n*d2)-(d*n2), (d*d2));
			    n6=(((n*d2)-(d*n2)) / gcf);
			    d6=((d*d2) / gcf);
		    }
	     if (d6==0||d6==1)
	       fraction[0]= Integer.toString(n6);
	    
	    // multiplying then Simplifying fractions
	    if (d*d2 !=0)
	    	{
	    	 int gcf = gcf(n2*n,d2*d);
	    	 n3=((n2*n)/gcf);
	    	 d3=((d2*d)/gcf);
		    }
	    if (d3==0||d3==1)
	    	fraction[2]= Integer.toString(n3);
    
	    // Dividing then Simplifying fractions
	    if (d*n2 !=0)
		    {
	    	 int gcf= gcf(n*d2,n2*d);
			 n4=((n*d2)/gcf);
			 d4=((n2*d)/gcf);
		    }
		if (d4==0||d4==1)
			fraction[3]= Integer.toString(n4);
		
		//SET THE FRACTION - MULTIPLYING AND DIVIDING
		fraction[0]= Integer.toString(n5) + "/" + Integer.toString(d5); 
		fraction[1]= Integer.toString(n6) + "/" + Integer.toString(d6);
		fraction[2]= Integer.toString(n3) + "/" + Integer.toString(d3);
    	fraction[3]= Integer.toString(n4) + "/" + Integer.toString(d4);
    	
    /*	// ADD AND SIMPLIFLY FRACTIONS - ADD AND SUBTRACTION
    	 if (d/d2 !=0)
		    {
	    	int gcf = gcf(((n*d2)+(d*n2)), (d*d2));
		    n5=( ((n*d2)+(d*n2))/ gcf);
		    d5=((d*d2) / gcf);
		    fraction[0]= Integer.toString(n5) + "/" + Integer.toString(d5); //(ad+bc)/bd 
		    }
	     if (d5==0||d5==1)
	    	 fraction[0]= Integer.toString(n5); //(ad+bc)/bd 	
	    
	     if (d/d2 !=0)
		    {
	    	int gcf = gcf(((n*d2)-(d*n2)), (d*d2));
		    n6=( ((n*d2)-(d*n2))/ gcf);
		    d6=((d*d2) / gcf);
			fraction[1]= Integer.toString(n6) + "/" + Integer.toString(d6); //(ad-bc)/bd 
		    }
	     if (d6==0||d6==1)
	    	 fraction[1]= Integer.toString(n6);

    	*/
    	
    	/* FORMULA FOR FIND GCF OF BOTH FRACTIONS THEN ADDING/SUBTRACTING THEM - WORKED FOR SOME EQUATIONS
	    // For Adding and Subtracting Both Fractions
    	int k= gcf2(d,d2);
	    if (k!=-5)
	    {
	    	if (d/k!=1)
	    	{
	    		n=n*k;
	    		d=d*k;
	    	}
	    	if (d2/k!=1)
	    	{
	    		n2=n*k;
	    		d2=d*k;
	    	}
	    	//fraction[0]= Integer.toString(n2+n) + "/" + Integer.toString(d2);
	    	//fraction[1]= Integer.toString(n2-n) + "/" + Integer.toString(d2);
	    }
	    */
	  // return d == 0 ? (""+ (n)) : (n / gcf) + "/" + (d / gcf);
	    
	}
	
	public int gcf2(int d, int d2)
	{
		int i=-1;
		while (i!=0)
		{
			if (d<d2)
				d2=d2-d;
			else if (d>d2)
				d=d-d2;
			else if (d==d2)
				i=0;
			else
				{
					
				System.out.print("\n No common Factor ");
					d=-5;
					i=0;
				}
			
		}
		return d;
			
	}
	
	public int gcf(int n, int d)
	{
		//System.out.println(++i);
	    return d == 0 ? n : gcf(d, n % d); 
	}
	
	
	
	
	public String precisionFormat() 
	{
		value = "%." + Integer.toString(precision)+ "f" ;
		return value;
	    
	}
	
	public void convertToFractions(int choice)
	{
		switch (choice) 
		{
        case 1:  frac = fraction[0]; //a/b + c/d = (ad+bc)/bd ;
                 break;
        case 2:  frac = fraction[1]; //  a/b - c/d = (ad-bc)/bd 	
                 break;
        case 3:  frac = fraction[2]; //  ab×cd=ac/bd
                 break;
        case 4:  frac = fraction[3]; //  ab/cd=ad/bc
        		break;
		}
		
	}
	
	/* FORMULA TO FIND DECIMAL PLACES AND CONVERT DECIMAL TO FRACTION - DIDNT FULLY WORK
	int getNumberOfDecimalPlace(BigDecimal number) 
	{
	    int scale = number.stripTrailingZeros().scale();
	    return scale > 0 ? scale : 0;
	}
	
	public Double decimalCount(double result)
	{
		bigDecimal = new BigDecimal("" + result);
		int decimalPlaces = getNumberOfDecimalPlace(bigDecimal);
		String k ="1";
		for (int i =0; i<decimalPlaces; i++){k=k + "0";}
		return Double.parseDouble(k);
		
	}
	
	public void setBackToFractions()
	{
		System.out.println(addFractions());
		System.out.println(decimalCount(addFractions()));
		int k = (int) ( (addFractions()/(decimalCount(addFractions()))) / (1 / (decimalCount(addFractions()))) ); //ad/bc
		System.out.println(k);
		System.out.println((addFractions() * decimalCount(addFractions())));
		//fraction[0] = simplify ((int) (addFractions() * Double.parseDouble(changeToFraction(addFractions()))), (int) (Double.parseDouble(changeToFraction(addFractions()))));
		//fraction[1] = simplify ((int) (subtractFractions() * Double.parseDouble(changeToFraction(subtractFractions()))), (int) (Double.parseDouble(changeToFraction(subtractFractions()))));
		//fraction[2] = simplify ((int) (divideFractions() * Double.parseDouble(changeToFraction(divideFractions()))), (int) (Double.parseDouble(changeToFraction(divideFractions()))));
		//fraction[3] = simplify ((int) (multiplyFractions() * Double.parseDouble(changeToFraction(multiplyFractions()))), (int) (Double.parseDouble(changeToFraction(multiplyFractions()))));
	}
*/
	public void printList(int choice)
	{
		 System.out.println("Fraction 1: " + numerator + "/" + denominator + " || " + "Reduced to: " + simplify(numerator,denominator));
		 System.out.println("Fraction 2: " + numerator2 + "/" + denominator2 + " || " + "Reduced to: " + simplify(numerator2,denominator2));
		
		 
		 switch (choice) 
			{
	        case 1:  System.out.print("     Choice 1: ADD \n ");
	        		 System.out.printf(simplify(numerator,denominator) + " + " + simplify(numerator2,denominator2) + " = " + frac + " = " + precisionFormat(),addFractions());
	                 break;
	        case 2:  System.out.print("     Choice 2: Subtract \n ");
	        		 System.out.printf("\n" + simplify(numerator,denominator) + " - " + simplify(numerator2,denominator2) + " = " + frac + " = " + precisionFormat(),subtractFractions());
	                 break;
	        case 3:	 System.out.print("     Choice 3: Multiply \n ");
	        		 System.out.printf("\n" + simplify(numerator,denominator) + " * " + simplify(numerator2,denominator2) + " = " + frac + " = " + precisionFormat(),multiplyFractions());
    				 break;
	        case 4:  System.out.print("     Choice 4: Divide \n ");
	        		 System.out.printf("\n" + simplify(numerator,denominator) + " / " + simplify(numerator2,denominator2) + " = " + frac+ " = " + precisionFormat(), divideFractions());
	                 break;
	       
			}
		
		
		 
		 
	}
	
}
