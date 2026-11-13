package Chapter6;

class Base{
    //생성자가 없으면 컴파일러 기본생성자를 만들어줌.
//    public Base(){
//        System.out.println("Base");
//    }// = 기본 생성자. 컴파일러가 자동으로 만들어줌.
    public Base(int a, int b){
        System.out.println("매개변수 받는 생성자");
    }
}

class Derive extends Base{
    public Derive(){//자식 클래스의 기본 생성자는 아래처럼 만들어진다.
        //super(); 에러나는 이유: 기존의 생성자가 있으면 기본 생성자가 부모 클래스에 자동으로 안만들어짐.
        super(1, 2); //왜냐하면 부모 클래스에 숫자 2개가 들어가는 매개변수가 있는 생성자를 호출함. 생성자 줄의 첫번째 줄에 있어야함. 그래야 부모생성자를 생성하고 자식 클래스를 생성함.
        System.out.println("Derive");

    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Derive d = new Derive();
    }
}
