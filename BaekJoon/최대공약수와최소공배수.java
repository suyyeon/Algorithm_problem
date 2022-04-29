import java.util.Scanner;

// 유클리드호제법으로 풀기
public class 최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(max(a,b));
		System.out.println(min(a,b));
		
	}
	
	static int max(int a, int b) { //최대공약수 
		if(a%b ==0) {
			return b;
		}
		return max(b, a%b);
	}
	
	static int min(int a, int b) { //최소공배수
		return a*b / max(a,b);
	}
}
