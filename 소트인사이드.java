import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드 {
	public static void main(String[] args) {
		// 수가 주어지면 내림차순
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		char[] list = new char[input.length()];

		for (int i = 0; i < input.length(); i++) {
			list[i] = input.charAt(i);
		}

		Arrays.sort(list);

		for (int i = list.length-1; i>-1; i--) {
			System.out.print(list[i]);
		}
		
	}
}
