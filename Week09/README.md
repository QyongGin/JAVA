# 클래스(2)

### 메소드란?
- 객체의 동작(기능)
- 호출해서 실행하는 중괄호 ```{}``` 블록. 호출 시 블록 안 모든 코드 일괄 실행.

### 메소드의 기능
- 필드를 읽고 수정
- 다른 객체 생성해서 다양한 기능 수행
- 객체 간 데이터 전달의 수단으로 사용

```java
// testMethod.class
public class testMethod {
	void Mtest (String in) {
		System.out.println(in);
	}
}

// ex
public class test {
		public static void main(String arg[]) {
			testMethod mt = new testMethod();
			mt.Mtest("하이"); // 하이
		}
}

```

### 메소드 이름 ```mtest```
- 자바 식별자 규칙에 맞게 작성한다.
  - 숫자로 시작하지 않는다.
  - $와 _를 제외한 특수문자 금지.
  - 메소드명은 소문자
  - 다른 단어가 혼합됐다면 뒷 단어의 첫글자는 대문자.

### 메소드 리턴 타입 ```void```
- 메소드를 실행한 후 리턴하는 값의 데이터 타입
- 메소드는 리턴값이 있기도 하고 ```void```처럼 없기도 한다.

### 메소드 매개변수 ```String in```
- 매개변수는 메소드를 실행 시 필요한 데이터를 외부에서 받기 위해 사용한다.
- 메소드의 매개변수도 있기도 하고 없어도 된다.
```java
// 매개변수로 int를 받을 떄 byte type 변수를 넣어도 자동 타입 변환이 된다. 대신 double은 불가능
// int형끼리 나누면 double형이러도 int형으로 반환되고 소실된 소수점은 돌아오지 않는다.
double mtest (int x, int y) { 
		return x / y;
	}
```

### 리턴 return
- 메소드 실행 중지 후 리턴값을 지정하는 역할
- 리턴 값이 있는 메소드
  - 반드시 ```return```문을 사영해서 리턴값을 지정해야 한다.
    ```java
    int plus(int x, int y) {
      int result = x + y;
      return result;
    }
    ```
  - ```return```문 뒤에 실행문이 오지 못한다.
- 리턴값이 없는 메소드에서 리턴의 역할
  - 메소드 실행을 강제 종료시키다.
