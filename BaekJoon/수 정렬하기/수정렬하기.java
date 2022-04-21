import java.util.Scanner;

public class 수정렬하기 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int num = 0;
		int list[] = new int[input];
				
		for (int i = 0; i < input; i++) {
			num = scan.nextInt();
			list[i] = num;
		}

		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length-1; j++) {
				if(list[j] > list[j+1]) {
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
				}
			}
		}

		for(int i : list) {
			System.out.println(i);
		}

	}

}
