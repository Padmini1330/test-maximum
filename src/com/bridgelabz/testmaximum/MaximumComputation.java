package com.bridgelabz.testmaximum;

public class MaximumComputation 
{

	public static <E extends Comparable<E>> void findMaximum(E firstNumber, E secondNumber, E thirdNumber)
	{
		E maxNumber;
		
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


}
