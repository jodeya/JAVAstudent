import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		double number1;
		double number2;
		double result;
		char operator;
		
		boolean again = true;
		
		do {
		System.out.println("choose number 1: ");
		number1 = scanner.nextDouble();
		System.out.println("choose number 2: ");
		number2 = scanner.nextDouble();
		System.out.println("choose mathematical operator (+, -, *, /): ");
		operator = scanner.next().charAt(0);
				
		switch(operator) {
		case '+' :
			result = number1 + number2;
			System.out.println(number1+" " + operator + " " + number2 + " = "+result);
			break;
		case '-' :
			result = number1 - number2;
			System.out.println(number1+" " + operator + " " + number2 + " = "+result);
			break;
		case '*' :
			result = number1 * number2;
			System.out.println(number1+" " + operator + " " + number2 + " = "+result);
			break;
		case '/' :
			result = number1 / number2;
			System.out.println(number1+" " + operator + " " + number2 + " = "+result);
			break;
		default : 
			System.out.println("choose between +, -, *, or /");
		}
			System.out.println("again? y/n");
			char check = scanner.next().charAt(0);
			if(check == 'y') {
				again = true;
			}else if(check == 'n') {
				again = false;
			}else {
				System.out.println("choose between y or n");
			}
			
		} while ( again == true);

		
	}

}
