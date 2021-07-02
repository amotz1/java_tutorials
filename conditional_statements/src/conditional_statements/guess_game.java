package conditional_statements;
import java.util.Scanner;

public class guess_game {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("guess a number");
		
		int grade = in.nextInt();
		if (grade < 60) {
			System.out.println('F');
			
		} else if (grade < 70) {
			System.out.println("D");
			
		} else if (grade < 80) {
			System.out.println("C");
			
		} else if (grade < 90) {
			System.out.println("B");
			
		} else if (grade < 100) {
			System.out.println("A");
		}
		
		// TODO Auto-generated method stub

	}

}
