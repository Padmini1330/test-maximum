package com.bridgelabz.testmaximum;

public class MaximumComputation  <E extends Comparable<E>> 
{
	E value1,value2,value3;
	
	public MaximumComputation(E value1,E value2,E value3) 
	{
		this.value1=value1;
		this.value2=value2;
		this.value3=value3;
	}
	
	private void testMaximum() {
		
		MaximumComputation.findMaximum(this.value1, this.value2, this.value3);

	}

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
		new MaximumComputation<Integer>(firstNumber, secondNumber, thirdNumber).testMaximum();
		new MaximumComputation<Double>(number1, number2, number3).testMaximum();
		new MaximumComputation<String>(value1, value2, value3).testMaximum();

	}

  
}
