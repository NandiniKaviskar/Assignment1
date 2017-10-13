import java.util.Scanner;


public class ReverseDigits {

	public static void main(String[] args) {
		/*Q3:1.Write a program to reverse the digits of the NUMBERS  in java programming
		 without using reverse command */
		int reminder, sum = 0;
		Scanner s=new Scanner(System.in);
	      System.out.println("Enter the number");
	      int n = s.nextInt();
	      
	      while(n>0){
	    	 reminder=n%10; //to get the last digit
	    	 sum=sum*10+reminder;
	    	 n=n/10;
	      }
	      
	      System.out.println(sum);
	      
	}

}
