package projectPractice;

import java.util.Scanner;

public class Factorialofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5,4,3,2,1
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int number= in.nextInt();
		int fact=1;
		for (int i=number;i>=1;i--){
			
		fact= fact*i;		
	}
		
		System.out.println("factorial of given number is "+ fact);


	
	}
	
}


