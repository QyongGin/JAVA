# 인터페이스 interface

### 인터페이스의 역할
- 객체의 사용 방법(기능-메소드)을 정의한 타입(객체 사용설명서)
- 객체의 교환성을 높여주어서 다형성을 구현하는 매우 중요한 역할이다.


### 인터페이스 선언
- File > New > Interface

## 인터페이스 구성 멤버 - 상수 필드
- 인터페이스는 상수 필드만 선언
  - 데이터를 저장하지 않는다.

### 인터페이스 구성 메법 - 추상 메소드


### 인터페이스 간 상속도 가능
```java
public interface 하위인터페이스 extends 상위인터페이스1, 상위인터페이스2 { ... }
```
- 하위 인터페이스 구현 클래스에서 재정의 해야 하는 메소드
  - 하위 인터페이스의 추상 메소드
  - 상위 인터페이스1의 추상 메소드
  - 상위 인터페이스2의 추상 메소드
