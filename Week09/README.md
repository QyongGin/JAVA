# 클래스(2)

### 메소드란?
- 객체의 동작(기능)
- 호출해서 실행하는 중괄호 ```{}``` 블록
- 호출 시 블록 안 모든 코드 일괄 실행.

### 메소드의 기능
- 필드를 읽고 수정
- 다른 객체 생성해서 다양한 기능 수행
- 객체 간 데이터 전달의 수단

```java
// testMethod.class
public class testMethod {
	void Mtest (String in) { // 메소드 선언
		System.out.println(in); // 실행 코드
	}
}

// ex
public class test {
		public static void main(String arg[]) {
			testMethod mt = new testMethod(); // 객체 생성
			mt.Mtest("하이"); // 메소드 호출
		}
}

```

## 메소드 선언
```java
리턴타입 메소드이름 (매개변수) {
	실행 코드 작성
}
// 리턴 타입 : 메소드가 리턴하는 결과 타입 표시
// 매개변수 : 메소드가 실행 시 필요한 데이터 받을 변수
```


### 메소드 이름 
- 자바 식별자 규칙에 맞게 작성한다.
  - 숫자로 시작하지 않는다.
  - $와 _를 제외한 특수문자 금지.
  - 관례적으로 메소드명은 소문자
  - 다른 단어가 혼합됐다면 뒷 단어의 첫글자는 대문자. ``mapleStory``

### 메소드 리턴 타입 
- 메소드를 실행한 후 리턴하는 값의 데이터 타입
- 메소드는 리턴값이 있기도 하고 ```void```처럼 없기도 한다.

### 메소드 매개변수 
- 매개변수는 메소드를 실행 시 필요한 데이터를 외부에서 받기 위해 사용한다.
- 메소드의 매개변수도 있기도 하고 없어도 된다.

```java
// 매개변수로 int를 받을 떄 byte type 변수를 넣어도 int보다 작기 때문에 자동 타입 변환이 된다. 대신 double은 불가능
// int형끼리 나누면 double형이어도 int형으로 반환되고 소실된 소수점은 돌아오지 않는다.
double mtest (int x, int y) { 
		return x / y; // 7 / 3 == 2.33333... 이지만 int형끼리 계산하여 실제로는 2.0이 반환된다.
			      // 정확한 계산을 위해서는 x나 y 중 하나라도 double형으로 변환해야 한다.
	}
```

### 리턴 return
- 메소드 실행 중지 후 리턴값을 지정하는 역할
- 리턴 값이 있는 메소드
  - 반드시 ```return```문을 사용해서 리턴값을 지정해야 한다.
    ```java
    int plus(int x, int y) { // 리턴 값 -> int
      int result = x + y;
      return result;
    }
    ```
  - ```return```문 뒤에 실행문이 오지 못한다. 메소드 실행 중지하기 때문.
- 리턴값이 없는 메소드에서 리턴의 역할
  - 메소드 실행을 강제 종료

  ### 메소드 실습
  ```java
  public class Calculator {
  	String Color; // 필드(속성)
   	String size;

  	public Calculator(String color, String size) { // 생성자
  		this.color = color; // this.color : 필드 color
		this.size = size; // size : 매개변수이자, 지역변수 size
	}

  	void powerOn() { // void : 리턴값이 없다.
		System.out.println("전원을 켭니다.");
  	}

  	void powerOff() {
  		System.out.println("전원을 끕니다.");
  	}

  	int plus(int x, int y) { // 리턴값 : int
  		return x+y;
  	}

	double divide(int x, int y) {
  		return (double)x/y; // double형으로 변환을 시켜서 소수점 결과 반환.
  	}	
  }
  ```

## 메소드 호출
- 메소드는 클래스 내부/외부에서 호출에 의해 실행
- 클래스 내부
  - 메소드 이름으로 호출
  ```java
  // 메소드 선언
  void run() {...}
  void stop() {...}

  // 호출
  void 내부메소드() {
  	run();
  	stop();
  }
- 클래스 외부
  - 객체 생성 후, 참조 변수를 이용해서 호출
  ```java
  void 외부메소드() {
  	Car ben = new Car(); // 객체 생성
  	car.run(); // 참조 변수를 통해 호출
  	car.stop();
  ```

- Calculator를 통한 메소드 호출
```java
public class CalcEx {
	public static void main(String[] agrs) {
		Calculator c1 = new Calculator("White", "small") // 생성자(color,size)
		System.out.println(c1.color + ", " + c1.size);

		int result1 = c1.plus(10,20);
		System.out.println("plus(10,20) = " + result1);
	}
}
```

### 매개변수의 개수를 모를 경우
- 매개변수는 일반적으로 개수가 정해져 있다.
- 경우에 따라서는 메소드 선언할 때 매개변수의 개수를 알지 못하는 경우가 발생하기도 한다.
- 예시
  - 메소드 선언
  ``int sum(int ... values){ }``
  - 메소드 호출
  ``int result1 = sum(1,2,3); int result2 = sum(1,2,3,4,5);`` 

- Calculator 실습
```java
// Calculator
int sum1(int[] values) { // 배열로 받는다.
	int sum = 0;
	for(int i=0; i<values.length; i++) // list는 size
		sum += values[i];
	return sum;
}

int sum2(int... values) { // 내부적으로 int[] values와 동일하게 적용
	int sum = 0;
	for(int i : values) { // 향상된 for문 (for-each) : 배열 요소를 하나씩 순회. 
		sum += i; // i에 대입된 각 요소 덧셈
	}
	return sum;
}
// CalcEx
int sum1 = c1.sum1(new int[] {1,2,3,4,5});
int sum2 = c1.sum2(1,2,3,4,5);
```

## 메소드 오버로딩(Overloaing)
- 클래스 내에 같은 이름의 메소드 여러 개 선언
- 하나의 메소드 이름으로 다양한 매개값을 받으려고
- 오버로딩의 조건
  - 매개변수의 타입, 개수, 순서 중 하나라도 달라야 한다. (다양한 매개변수를 받으려고 했으니까)

```java
int plus(int x, int y) {
	int result = x + y;
	return result;
}
double plus(double x, double y) {
	double result = x + y;
	return result;
}

// 오버로딩이 아닌 예시. 매개변수의 타입, 개수, 순서가 달라야 한다. 
int plus(int x, int y) {...}
doublie plus(int q, int b) {...}
```

### 메소드 오버로딩 실습

```java
public class Area {
	
	// 메소드의 이름은 모두 같다. 매개변수의 타입과 개수가 다르다.
	// 매개값에 따라 areaCal의 역할이 달라진다.
	
	double areaCal(double radius) {
		return 3.14 * radius * radius;
	}
	
	int areaCal(int width) {
		return width * width;
	}
	
	int areaCal(int width, int height) {
		return width * height;
	}
}
// 
import java.util.Scanner; // 자바 유틸 스캐너 라이브러리 호출 

public class AreaEx {

	public static void main(String[] args) {
		Area areaEx = new Area(); // 새로운 Area 객체 생성, areaEx가 참조.
		Scanner sc = new Scanner(System.in); // 새로운 Scanner 객체 생성, 매개변수는 시스템 입력.
		System.out.print("반지름을 입력하라. : ");
		
		System.out.println("원의 면적 : " + areaEx.areaCal(sc.nextDouble())); 

		System.out.println("정사각형의 넓이 : " + areaEx.areaCal(sc.nextInt()));
		
		System.out.println("직사각형의 넓이 : " + areaEx.areaCal(sc.nextInt(), sc.nextInt()));
		
	}

}
// 결과 
// 반지름을 입력하라. : 31.2
// 원의 면적 : 3056.6016
// 20 입력
// 정사각형의 넓이 : 400
// 30 입력
// 40 입력 
// 직사각형의 넓이 : 1200

```


## 인스턴스 멤버와 this

### 인스턴스 멤버
- 객체(인스턴스) 생성 후 사용하는 필드와 메소드
  - ```java
    public class Car {
    	int gas; // 인스턴스 필드
    	void setSpeed(int speed) {...} // 인스턴스 메소드
    }
    ```
  - 이들을 인스턴스 필드와 인스턴스 메소드라 한다.
- 인스턴스 멤버는 객체에 소속된 멤버이므로 객체 없이 사용 불가

### thus
- 객체 자신의 참조를 가진 키워드
- 객체 내부에서 인스턴스 멤버임을 명확히 하기 위해 this. 사용 ``this.gas``
- 매개변수와 필드명이 동일 시 인스턴스 필드임을 명확히 하기 위해 사용
  - ```java
    Car(int gas){
    	this.gas = gas;
    }
    ```
## 정적 멤버와 static

### 정적 static 멤버란?
- 클래스에 고정된 필드(정적 필드)와 메소드(정적 메소드)
- 정적 멤버는 클래스에 소속된 멤버
  - 객체 내부에 존재하지 않고 메소드 영역에 존재
  - 정적 멤버는 객체를 생성하지 않고 클래스로 바로 접근해서 사용 ``gas.setSpeed(10);``

### 정적 멤버 선언
```java
public class 클래스명 {
	static 타입 필드 = 초기값; // 정적 필드
	static 리턴타입 메소드명(매개변수) {...} // 정적 메소드
}
```
### 정적 멤버 사용 
- 클래스 이름과 도트``.``연산자로 접근
```java
public class Calculator {
	static int plus(int x, int y){ ...}
}
public class CacEx {
	public static void main(String[] args) {
		System.out.printf("%d + %d = %d\n", 1,3,Calculator.plus(1,3))
	}
}
```

## 인스턴스 멤버 VS 정적 멤버
### 


















 
  	


















  	
