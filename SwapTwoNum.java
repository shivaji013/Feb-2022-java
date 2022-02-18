import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String args[])
	{
		/*
		 * int num1=10; int num2=20;
		 * 
		 * 
		 * num1=num1+num2; num2=num1-num2; num1=num1-num2;
		 * System.out.println("this is a first num1  ="+num1); System.out.println("this is a second num2   ="+num2);
		 */
		
		int num1;
		int num2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the num1 And num2 value");
		num1=scan.nextInt();
		System.out.println("num1  ="+num1);
		num2=scan.nextInt();
		System.out.println("num2  ="+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("Number is first   ::"+num1);
		System.out.println("Number is Second  ::"+num2);
	}
}
