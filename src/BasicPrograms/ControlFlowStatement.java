package BasicPrograms;

import java.util.Scanner;

public class ControlFlowStatement {
	
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number:");
	    int x =scan.nextInt();
	if (x>0) {
		System.out.println("The given number is positive");
		
	}else if (x<0) {
      System.out.println("The given number is negative");
		
		
	}else if (x==0) {
		System.out.println("The given number is Zero");
		
	}
	
		
	}

}
