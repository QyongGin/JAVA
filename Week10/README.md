# 상속 

### Car.java 
```java
// package Week10 소속
// 필드 private 선언. 외부 접근 제한.
private String company;

// 외부에서 값이 필요한 경우 값을 제공하기 위해 getter() 메소드 선언
// getter() 메소드는 외부에 값 제공을 위해 public
public String getCompany(){
  return company;
}

// 외부에서 준 값 필드에 적용을 위해 setter() 메소드 이용.
// public 선언.
// 필드와 매개변수 이름이 겹치므로 필드에 this.를 붙여 칭한다.
public void setCompany(String company){
  this.company = company;
}
```

### CarEx.java 
```java
// 
package Week10;

