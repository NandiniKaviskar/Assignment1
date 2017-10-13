import java.util.Scanner;


public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// 	Q1:Write a program to find largest of three numbers.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a= s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		
		if(a==b && a==c)
			System.out.println("All numbers are equal");
		else if(a>b && a>c)
			System.out.println("a = " +a +" is largest");
		else if(b>c)
			System.out.println("b = " +b +" is largest");
		else
			System.out.println("c = " +c +" is largest");
			
	}

}
