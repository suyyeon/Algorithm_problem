import java.util.Scanner;

public class 알파벳찾기 {
	public static void main(String[] args) {

		// 소문자로 이루어진 단어 s 입력
		// a~z 개수 세기
		// 포함 되어 있지 않으면 -1

		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();

		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(temp.indexOf(i) + " ");
		}
	}
}
