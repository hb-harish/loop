
import java.util.Scanner;

public class Wloop {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int secretNumber,secretNumber2, guess = 0;//guess is initialized to 0
		
		secretNumber = 5;
		secretNumber2 = 123;
		
		System.out.println("I'm thinking of a number between 1 and 1000");
		System.out.print("Enter the number:");
		guess = keyboard.nextInt();
		
		while ( guess != secretNumber2 && guess != secretNumber)
		{
			System.out.println("\nYou are wrong. Try again.");
			System.out.println("Enter the number: ");
			guess = keyboard.nextInt();
		}
		
		System.out.println("You are correct but you don't win a prize :( such is life!");
		keyboard.close();
	}
}