# ๐ฉ๋ฌธ์์ด ๋ฐ๋ณต ๋ฉ์๋ repeat()
- String ๋ฌธ์์ด์ ํ๋ผ๋ฏธํฐ์ ์ฃผ์ด์ง ํ์๋งํผ ๋ฐ๋ณตํจ
- 0 : ๋น ๋ฌธ์์ด์ ๋ฐํ
- -(์์) : IllegalArgumentExceptionthrow ์๋ฌ๋ฅผ ๋ฐํ
  - ๋งค๊ฐ๋ณ์๊ฐ ์๋ํ์ง ์์ ์ํฉ์ ์ ๋ฐ์ํฌ ๋ 
- 1 : ๋ฌธ์์ด ๊ทธ๋๋ก ๋ฐํ

```java
public class Main {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.repeat(3));
	}
}

>> ๊ฒฐ๊ณผ ์ถ๋ ฅ HelloHelloHello
```


## repeat() ์ฌ์ฉ ์ฝ๋
```java
for (int i = 1; i <= num; i++) {
	System.out.println(" ".repeat(num-i) + "*".repeat(i));
}
```

## ๋ด๊ฐ ์ง  ์ฝ๋ - for๋ฌธ ์ฌ์ฉ
```java
for(int i = 1; i <= num; i++){
	     for(int j = 1; j <= num-i; j++)
		       System.out.print(" ");
	     for(int j = 1; j <= i; j++)
		       System.out.print("*");
	     System.out.println();
```
