import java.util.Scanner;

public class OX퀴즈 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		String list[] = new String[input];

		for (int i = 0; i < input; i++) {
			list[i] = scan.next();
		}

		for (int i = 0; i < input; i++) {
			char[] list2 = list[i].toCharArray();
			int count = 0;
			int sum = 0;
			for (int j = 0; j < list2.length; j++) {
				if (list2[j] == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum = sum + count;
			}
			System.out.println(sum);
			count = 0;
			sum = 0;
		}
	}
}
