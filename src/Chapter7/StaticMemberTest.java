package Chapter7;

interface Validator{
    static boolean validate(String email){
        if(email.contains("@") && email != null){
            return true;
        }
        else return false;
    }
}
public class StaticMemberTest {
    public static void main(String[] args) {
        //인터페이스는 객체 생성이 안됌
        System.out.println(Validator.validate("killoper35@gmil.com"));
        //static은 new 할 필요 없이 클래스 이름.메소드이름()으로 바로 사용가능.
    }
}
