import java.util.Scanner;

public class 숫자의개수 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		int result = a * b * c;
		int[] cut = new int[10];

		while (result > 0) {
			cut[result % 10]++;
			result /= 10;
		}

		for (int i = 0; i < cut.length; i++) {
			System.out.println(cut[i]);
		}
	}
}
