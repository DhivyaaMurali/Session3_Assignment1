package session3_assignment;

import java.util.Scanner;

public class MathClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		System.out.println("The number entered is " +num );
		double sqrt = Math.sqrt(num);
		System.out.println("The Square root of" +num+ ":" +sqrt);
		double cbrt = Math.cbrt(num);
		System.out.println("The Cube root of" +num+ ":" +cbrt);

	}

}
