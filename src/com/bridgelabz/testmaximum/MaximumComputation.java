package com.bridgelabz.testmaximum;

public class MaximumComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("***Welcome to Max Number Computation problem***");
		Integer firstNumber=3, secondNumber=1, thirdNumber=5;
		Double number1=1.29, number2=7.83, number3= 2.77;
		String value1="apple" ,value2="peach", value3="banana";
		findMaximum(firstNumber,secondNumber,thirdNumber);
		findMaximum(number1,number2,number3);
		findMaximum(value1,value2,value3);

	}

	private static void findMaximum(String value1, String value2, String value3) 
	{
		String maxString;
		
		if(value1.compareTo(value2)>0 && value1.compareTo(value3)>0) 
		{
			maxString=value1;
		}
		else if(value2.compareTo(value1)>0 && value2.compareTo(value3)>0) 
		{
			maxString=value2;
		}
		else
			maxString=value3;
		
		
		System.out.println("The Maximum of Three String Values is "+maxString);
		
	}

	private static void findMaximum(Double number1, Double number2, Double number3) 
	{
		Double maxNumber;
		
		if(number1.compareTo(number2)>0 && number1.compareTo(number3)>0)
		{
			maxNumber=number1;
		}
		else if (number2.compareTo(number1)>0 && number2.compareTo(number3)>0)
		{
			maxNumber=number2;
		}
		else
			maxNumber=number3;
		
		
		System.out.println("The maximum of Three Float Numbers is "+maxNumber);
		
	}

	private static void findMaximum(Integer firstNumber, Integer secondNumber, Integer thirdNumber) 
	{
		Integer maxNumber;
		
		if(firstNumber.compareTo(secondNumber)>0 && firstNumber.compareTo(thirdNumber)>0)
		{
			maxNumber=firstNumber;
		}
		else if(secondNumber.compareTo(thirdNumber)>0 && secondNumber.compareTo(firstNumber)>0)
		{
			maxNumber=secondNumber;
		}
		else
			maxNumber=thirdNumber;
		
		
		System.out.println("The maximum of Three Integer Numbers is "+ maxNumber);
		
		
	}

}
