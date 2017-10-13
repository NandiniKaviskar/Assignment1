import java.util.Scanner;


public class SwapNumbers2 {

	public static void main(String[] args) {
		// Q2:Swap two number without using third variable
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers to swap");
		int a= s.nextInt();
		int b= s.nextInt();
		
		System.out.println("Before swap a is : " +a+ " and b is :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swap a is : " +a+ " and b is :"+b);
	}

}
