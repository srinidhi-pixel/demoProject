package BasicPrograms;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age:");
	    int x =scan.nextInt();
	    
	    if (x>18) {
	    	System.out.println("your eligible for voting");
			
		}else {
			System.out.println("your not eligible for voting");
		}
	}

}
