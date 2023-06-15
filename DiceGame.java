import java.util.Random;
import java.util.Scanner;
class DiceGame{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	int die1 = random.nextInt(6) + 1;
	int die2 = random.nextInt(6) + 1;
	int sum = die1 + die2;
	System.out.println("What is your name?");
	String name = sc.nextLine();
	System.out.println("Hello, "+ name + "!");
	System.out.println("Rolling dice...");
	System.out.println("Die 1 : " + die1);
	System.out.println("Die 2 : " + die2);
	System.out.println("Total value: " + sum);
    }
}
