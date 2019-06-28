import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		//welcome person
		System.out.println("Welcome to the Grand Circus Casino!");
		// ask how many sides
		
		int count = 0;
		String go;
		

		do {
			System.out.println("How many sides should each die have? ");
			int number = scnr.nextInt();
			
			generateRandomDieRoll(number);
			generateRandomDieRoll(number);
			
			count++;
			
			System.out.println("Roll again? (y/n)");
			go = scnr.next();
			
		} while (go.equals("y") || go.equals("Y"));

		
	}
	
	public static int generateRandomDieRoll(int number) {
		Random ran = new Random();
		int die1;
		
		die1 = ran.nextInt(number) + 1;
		
		System.out.println(die1);
		
		
		
		return die1;
	} 
	
	
	

}
