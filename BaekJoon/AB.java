package BaekJoon;

import java.util.Scanner;

public class AB {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double A = scan.nextDouble();
		double B = scan.nextDouble();

		scan.close();
		System.out.println(A / B);

	}
}