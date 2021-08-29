package com.bridgelabz.testmaximum;

public class MaximumComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("***Welcome to Max Number Computation problem***");
		Integer firstNumber=3, secondNumber=1, thirdNumber=5;
		Double number1=1.29, number2=7.83, number3= 2.77;
		findMaximum(firstNumber,secondNumber,thirdNumber);
		findMaximum(number1,number2,number3);

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
