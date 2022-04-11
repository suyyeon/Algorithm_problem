# 🚩 문자 뽑기 메서드 charAt()
- String 타입을 char 타입으로 한 문자만 받음
- 특정 위치의 문자를 반환해줌

## 문자열
```java
String str = "Hello Wordl";
System.out.print(str.charAt(0)); // H 출력
```
## 숫자 받기
- 숫자값으로 저장된 문자열을 그대로 숫자 값으로 출력하고 싶은 경우 ASCII에 의해 48 혹은 '0'을 뺀 후 출력하면 됨
```java
String str = "12345";
System.out.println(str.charAt(2)-48); // 3 출력
System.out.println(str.charAt(3)-'0'); // 4 출력
```

## 내가 짠 코드
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

## charAt() 사용 코드
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
