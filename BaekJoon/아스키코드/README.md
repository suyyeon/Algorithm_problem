# ๐ฉSystem.in.read()
- ๋จ, ํ๋์ ๋ฌธ์๋ฅผ ์๋ ฅ๋ฐ์ ์๋ ฅ๋ฐ์ ๋ฌธ์์ ์์คํค ์ฝ๋๋ฅผ ๋ฐํํจ
- ๋ฒํผ(InputStream)๋ฅผ ์ฌ์ฉํ๊ธฐ ๋๋ฌธ์ ํจ์จ์ ์ด๋ฉฐ throws(์์ธ์ฒ๋ฆฌ)๋ฅผ ํ์์ ์ผ๋ก ํด์ฃผ์ด์ผ ํจ


## System.in.read() ์ฌ์ฉ ์ฝ๋
์๋ ์ด๋ ๊ฒ ์งง์ ์๊ฐ ์๋ค๋..
```java
public class Main {
	public static void main(String[] args) throws Exception {
		int a = System.in.read(); // ์์คํค์ฝ๋
   		char a = (char)System.in.read(); // ๋ฌธ์ ๊ทธ๋๋ก
		int a = System.in.read()-48; // ์ซ์ ๊ทธ๋๋ก
		System.out.println(a);
	}
}
```

## ๋ด๊ฐ ์ง  ์ฝ๋
```java
import java.util.Scanner;

public class ์์คํค์ฝ๋ {
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
