import java.util.Scanner;

public class 아스키코드 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char cword = input.charAt(0);
		int iword = (int)cword;
		
		if(iword >=97 && iword <=122)
			System.out.println(iword);
		else if(iword >=65 && iword <=90)
			System.out.println(iword);
		else if(iword >=48 && iword <=57)
			System.out.println(iword);
		
	}

}
