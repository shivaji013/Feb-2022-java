
import java.util.Scanner;

public class SumASCII_value {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		char first;
		char second;
		char third;
		
		System.out.println("Enter the character values :");
		Scanner scan=new Scanner(System.in);
		
		first=scan.next().charAt(0);
		System.out.println("Enter the first character  : "+first);
		
		second=scan.next().charAt(0);
		System.out.println("Enter the second character : "+second);

		third=scan.next().charAt(0);
		System.out.println("Eneter the third character : "+third);

		
		//logic char 
		int sum=first+second+third;
		
		System.out.println("Sum of Three char value  ::  "+sum);
		
		
	}

}
