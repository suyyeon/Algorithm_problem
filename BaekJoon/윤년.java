import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 윤년 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// 4로 나누어 떨어지면서 100으로 나누어떨어지지 않으면
		// 400으로 나누어떨어지면
		if (N % 4 == 0 && N % 100 != 0 || N % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
