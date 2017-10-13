import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		// Q2:Write a program to check whether the given number is prime number or not
		 Scanner s=new Scanner(System.in);
	      System.out.println("Enter the number to check ");
	      int n = s.nextInt();
	      boolean isPrime=true;
	      
	      for(int i=2; i<=n/2; i++){
	    	  int temp=n%i;
	    	  if(temp==0){
	    		  isPrime=false;
	    		  break;
	    	  }
	      }
	      
	      if(isPrime && n!=1)
	    	  System.out.println(n + " is prime number ");
	      else
	    	  System.out.println(n + " is not a prime number ");
	    	 
	}

}
