import java.util.Scanner;


public class OddEven {

	public static void main(String[] args) {
		// Q1:Write a program to find odd or even  
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number to check whether its Odd or Even");
      int n = s.nextInt();
      if(n%2==0)
    	  System.out.println(n +" is Even number");
      else
    	 System.out.println(n +" is Odd number");
	}

}
