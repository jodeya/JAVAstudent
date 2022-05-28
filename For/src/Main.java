import java.util.Scanner;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give height of tower : ");
		int height = scan.nextInt();

		for (int i = 1; i <= height; i++) {

			for (int j = height - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print("#");
			}
			System.out.println();
		}
//---------------attempt1-------------------------------------------------
//		for (int i = 1; i <= height; i++) {
//
//			for (int j = 0; j < i - 1; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= ((height - i) * 2) + 1; k++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//-------------------------------------------------------------------------
//---------------attempt2--------------------------------------------------
		for (int i = 1; i <= height-1; i++) {

			for (int j = 1; j <= i ; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= ((height - i) * 2) - 1; k++) {
				System.out.print("#");
			}
			System.out.println();
		}
//-------------------------------------------------------------------------	
	}
}
