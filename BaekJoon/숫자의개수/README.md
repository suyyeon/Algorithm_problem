# ๐ฉ ๋ฌธ์ ๋ฝ๊ธฐ ๋ฉ์๋ charAt()
- String ํ์์ char ํ์์ผ๋ก ํ ๋ฌธ์๋ง ๋ฐ์
- ํน์  ์์น์ ๋ฌธ์๋ฅผ ๋ฐํํด์ค

## ๋ฌธ์์ด
```java
String str = "Hello Wordl";
System.out.print(str.charAt(0)); // H ์ถ๋ ฅ
```
## ์ซ์ ๋ฐ๊ธฐ
- ์ซ์๊ฐ์ผ๋ก ์ ์ฅ๋ ๋ฌธ์์ด์ ๊ทธ๋๋ก ์ซ์ ๊ฐ์ผ๋ก ์ถ๋ ฅํ๊ณ  ์ถ์ ๊ฒฝ์ฐ ASCII์ ์ํด 48 ํน์ '0'์ ๋บ ํ ์ถ๋ ฅํ๋ฉด ๋จ
```java
String str = "12345";
System.out.println(str.charAt(2)-48); // 3 ์ถ๋ ฅ
System.out.println(str.charAt(3)-'0'); // 4 ์ถ๋ ฅ
```

## charAt() ์ฌ์ฉ ์ฝ๋
```java
int[] cut = new int[10];

String str = String.valueOf(result);

for (int i = 0; i < str.length(); i++) {
	cut[(str.charAt(i) - '0')]++;
}

for (int v : cut) {
	System.out.println(v);
}
```

## ๋ด๊ฐ ์ง  ์ฝ๋
```java
Scanner scan = new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
scan.close();

int result = a * b * c;
int[] cut = new int[10];

while(result > 0) {
	cut[result%10]++; 
	result/=10; 
}

for (int i = 0; i < cut.length; i++) {
	System.out.println(cut[i]);
}
```
