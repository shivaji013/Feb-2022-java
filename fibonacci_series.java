package Assignment_java;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1,num;
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		System.out.print(num);
		for(int i=1;i<=num;i++)
        {
			int c=a+b;
          	System.out.println("Result :: "+c);
        	a=b;
        	b=c;
        }
	}

}
