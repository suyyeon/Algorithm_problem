# 🚩System.in.read()
- 단, 하나의 문자를 입력받아 입력받은 문자의 아스키 코드를 반환함
- 버퍼(InputStream)를 사용하기 때문에 효율적이며 throw(예외처리)를 필수적으로 해주어야 함


## System.in.read() 사용 코드
아니 이렇게 짧을 수가 있다니..
```java
public class Main {
	public static void main(String[] args) throws Exception {
		int input = System.in.read(); // 아스키코드
    char a = (char)System.in.read(); // 문자 그대로
		int a = System.in.read()-48; // 숫자 그대로
		System.out.println(input);
	}
}
```

## 내가 짠 코드
```java
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
```
