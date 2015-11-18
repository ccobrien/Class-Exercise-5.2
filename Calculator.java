

public class Calculator {
	public static double getSum(double [] num){
		double sum = 0.0;
		
		for(int i = 0; i<num.length; i++)
		{
			sum+=num[i];
		}
		return(sum);
	}
	public static double getAverage(double [] num){
		double sum = 0.0;
		
		for(int i = 0; i < num.length; i++)
		{
			sum+= num[i];
		}
		
		return(sum)/num.length;
	}
	public static double getProduct(double [] num){
		double product = 1.0;
		
		for(int i = 0; i < num.length; i++)
		{
			product = product * num[i];
		}
		//product = num[0] * num[1] * num[2];
		
		return (product);
	}
	public static int getSum(int [] num){
		int sum = 0;
		
		for(int i = 0; i<num.length; i++)
		{
			sum+=num[i];
		}
		return(sum);
	}
	public static int getAverage(int [] num){
		int sum = 0;
		
		for(int i = 0; i < num.length; i++)
		{
			sum+= num[i];
		}
		
		return(sum)/num.length;
	}
	public static int getProduct(int [] num){
		int product = 1;
		
		product = num[0] * num[1] * num[2];
		
		return product;
	}
	public static double getFirstFactorial(double []num){
		double firstFactor = 1;
	
		for(double i = num[0]; i > 0 ; i--)
		{
			firstFactor = firstFactor * i;
		}
		return firstFactor;
	}
	
	public static double getSecondFactorial(double []num){
		double secondFactor = 1;
	
		for(double i = num[1]; i > 0 ; i--)
		{
			secondFactor = secondFactor * i;
		}
		return secondFactor;
	}
	public static double getThirdFactorial(double []num){
		double thirdFactor = 1;
		
		for(double i = num[2]; i > 0 ; i--)
		{
			thirdFactor = thirdFactor * i;
		}
		
		return thirdFactor;
	}
	
	
}
