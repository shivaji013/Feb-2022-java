package Assignment_java;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args)
	{
		
		double celcius=0.0;
		double fahrenheit=0.0;
		Scanner scan=new Scanner(System.in);
		
		//User input celcius
		System.out.print("Enter the Celcius value ::");
		celcius=scan.nextFloat();
		
		//Logic Celcius to fahrenheit
		fahrenheit=((celcius*9/5)+32);
		
		//Display Result
		System.out.println("Celcius to fahrenheit ::"+fahrenheit);
	}

}
