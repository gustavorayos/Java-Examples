package code;

public class FindGCD {
	public static int gcd (int num1, int num2) {
		
		if ((num1 < 0) || (num2 < 0)) // error base for negative integer.
			return 0;
		//if (num1 == 0) // cases for if one of the integers is 0.
			//return num2;
		//else if (num2 == 0)
			//return num1;
		if ((num2 <= num1) && (num1 % num2 == 0)) // base case
			return num2;
		if (num1 < num2) // recursive steps
			return gcd(num2, num1);
		return gcd(num2, (num1 % num2));
		
	} // end of gcd method 
	
	public static void main (String args[]) {
		
		int num1 = 6;
		int num2 = 18;
		
		System.out.println (gcd(num1, num2));
		
	} // end of main method
} // end of FindGCD class 