import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name :");
		String name = scanner.nextLine();
		System.out.println("your name is : "+name);
		
		System.out.println("What is your age : ");
		int age = scanner.nextInt();
		System.out.println("your are "+age+" years old");
		
		scanner.nextLine();
		
		System.out.println("What is your favorite food :");
		String food = scanner.nextLine();
		System.out.println("you like "+food);
		
	}
}