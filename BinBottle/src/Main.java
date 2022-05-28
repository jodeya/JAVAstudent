import java.util.*;

public class Main {

	public static void main(String[] args) {
		boolean test;;
		do {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many bottles : ");
		int bottles = scan.nextInt();
		System.out.println("you need "+ calculate(bottles)+" crate(s) for "+ bottles+" bottles.");
		System.out.println("again? (y/n)");
		char answer = scan.next().charAt(0);
		if (answer != 'y') {
			test = false;
		}else {
			test = true;
		}
		} while (test);
		
	}
	 static int calculate (double bottles) {		
		 return (int) Math.ceil(bottles/24);
	}

}
