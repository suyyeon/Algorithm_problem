# 🚩문자열 반복 메서드 repeat()
- String 문자열을 파라미터의 주어진 횟수만큼 반복함
- 0 : 빈 문자열을 반환
- -(음수) : IllegalArgumentExceptionthrow 에러를 반환
  - 매개변수가 의도하지 않은 상황을 유발시킬 때 
- 1 : 문자열 그대로 반환

```java
public class Main {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.repeat(3));
	}
}

>> 결과 출력 HelloHelloHello
```


## repeat() 사용 코드
```java
for (int i = 1; i <= num; i++) {
	System.out.println(" ".repeat(num-i) + "*".repeat(i));
}
```

## 내가 짠 코드 - for문 사용
```java
for(int i = 1; i <= num; i++){
	     for(int j = 1; j <= num-i; j++)
		       System.out.print(" ");
	     for(int j = 1; j <= i; j++)
		       System.out.print("*");
	     System.out.println();
```
