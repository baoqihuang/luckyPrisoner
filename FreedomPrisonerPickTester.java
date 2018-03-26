package sjsu.Huang.cs146.project1;
import java.util.Scanner;
/**
 * The tester class for FreedomPrisonerPick
 * @author michaelhuang
 */
public class FreedomPrisonerPickTester 
{
	public static void main(String[] args)  
	{
		Scanner scan = new Scanner(System.in);  //construct a Scanner object scan
		System.out.println("How many prisoners in the land");  //promote the number of prisoners
		int numberOfPrisoners = scan.nextInt();  //assign the number to numberOfPrisoners
		System.out.println("How many times need to count for each elimination?"); //promote the number to eliminate
		int count = scan.nextInt();  //assign the number to count
		scan.close(); //close the scanner
		//construct a FreedomPrisonerPick object luckyWinner
		FreedomPrisonerPick winner = new FreedomPrisonerPick(numberOfPrisoners, count); 
		//boolean ifEmpty = winner.getList().isEmpty();
		//int n = winner.getList().getCount();
		//System.out.println(ifEmpty + "   " + n);
		//winner.getList().printList();
		System.out.println("The lucky winner is " + winner.luckyWinner());  //print the lucky winner number
		FreedomPrisonerPickTest test = new FreedomPrisonerPickTest(); //construct a Junit tester
		test.testluckyWinner();  //test the luckyWinner method
	}
}   