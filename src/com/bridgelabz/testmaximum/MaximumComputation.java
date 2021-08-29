package com.bridgelabz.testmaximum;

public class MaximumComputation 
{

	public static void main(String[] args) 
	{
		System.out.println("***Welcome to Max Number Computation problem***");
		Integer firstNumber=3;
		Integer secondNumber=1;
		Integer thirdNumber=5;
		findMaximum(firstNumber,secondNumber,thirdNumber);

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
		
		
		System.out.println("The maximum of Three Numbers is "+ maxNumber);
		
		
	}

}
