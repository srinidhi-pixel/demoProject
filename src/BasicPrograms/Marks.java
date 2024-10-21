package BasicPrograms;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Marks:");
	    int x =scan.nextInt();
	    if (x>=90) {
	    	System.out.println("Grade A");
	    }
	    else if (x>=80) {
			System.out.println("Grade B");
		}else if (x>=70) {
			System.out.println("Grade C");
			
		}else if (x>=60) {
			System.out.println("Grade D");
		}else if (x<60) {
			System.out.println("Fail");
			
		}
	    
		}
	    
	    
	}

