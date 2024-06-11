package statementprj;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		String answer;
		do {
		Scanner input =new Scanner(System.in);
		//System.out.println("Curiosity is the starting point for great adventure");
		System.out.println("Enter the quantity");
		int quantity=input.nextInt();
		System.out.println("Enter the price");
		int price=input.nextInt();
		double total= quantity*price;
		System.out.println("Total is "+total);
		System.out.println("*********************");
		
		System.out.println("Do you want to perform again");
		answer=input.next();
	

	}while(answer.equals("Yes"));

}
}
