
public class CalculatorDriver {
	public static void main(String args[])
	{
		double [] num = new double [3];
		
		num[0] = 12.0;
		num[1] = 3.0;
		num[2] = 7.0;
		
		System.out.print("The values of the array (in order) are: ");
		for(int i =0; i < num.length; i++)
		{
			System.out.print(num[i] + ", ");
		}
		//System.out.println("The numbers of the array in order are: " + Arrays.asList(num));
		System.out.println("\nThe sum of the numbers is " + Calculator.getSum(num));
		System.out.println("The average of the numbers is " + Calculator.getAverage(num));
		System.out.println("The product of the numbers is " + Calculator.getProduct(num));
	
		System.out.println("The factorial of the first value of the array is " + Calculator.getFirstFactorial(num));
		System.out.println("The factorial of the second value of the array is " + Calculator.getSecondFactorial(num));
		System.out.println("The factorial of the third value of the array is " + Calculator.getThirdFactorial(num));

	
	
	}
}
