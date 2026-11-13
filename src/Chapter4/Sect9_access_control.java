package Chapter4;
/*
접근 제어(access control)란 클래스의 멤버에 접근하는 것을 제어하는 것이다.
public이나 private의 접근 지정자를 멤버 앞에 붙여서 접근을 제한하게 된다


접근 제어(access control)란 멤버나 클래스에 접근하는 것을 제어하는 것이다.
Public이나 private의 접근 지정자를 멤버나 클래스 앞에 붙여서 접근을 제한한다.
public은 공용이라는 의미이므로 public을 멤버 앞에 붙이면 누구나 자유롭게 접근할 수 있는 멤버가 된다.
반대로 private은 전용이라는 의미이므로 private을 붙이면 클래스 안에서만 접근이 가능한멤버가 된다. p
rotected를 붙이면 멤버는 부모 클래스와 자식 클래스만이 접근할 수 있다


- public 클래스: 모든 패키지에서 접근 가능하다. public으로 선언된 클래스는 프로젝트 내 어디서든 사용할 수 있다.

public class PublicClass {
    // 클래스 내용
}


-default(package-private) 클래스: 명시적으로 접근 지정자를 붙이지 않은 경우 기본값으로 설정된다. 같은 패키지 내에서만 접근 가능하다. 다른 패키지에서는 해당 클래스를 사용할 수 없다.
class DefaultClass {
    // 클래스 내용
}
- private: 선언된 클래스 내에서만 접근 가능하다. 외부에서 접근할 수 없으므로 정보 은닉에 사용된다.
- protected: 동일 패키지 내의 클래스와 상속받은 하위 클래스에서 접근 가능하다. 주로 상속 관계에서 사용된다.
- default: 접근 지정자를 명시하지 않으면 기본적으로 적용된다. 동일 패키지 내의 클래스에서만 접근 가능하다.
- public: 모든 클래스에서 접근 가능하다.

class A {
       private int a;    // 전용
    int b;            // 디폴트
    public int c;        // 공용
}

public class Test {
    public static void main(String args[]) {
        A obj = new A();    // 객체 생성

    //obj.a = 10;		// 오류! 전용 멤버는 다른 클래스에서 접근 불가
    obj.b = 20;        // 디폴트 멤버는 접근 가능
    obj.c = 30;        // 공용 멤버는 접근 가능
    }
}


 */
class A {
    private int a;    // 전용
    int b;            // 디폴트
    public int c;        // 공용
}
public class Sect9_access_control {
}
