package Chapter4;

public class Student {
    //메소드 만드는 법(동사 만드는 법)
    //1. 매개변수가 들어갈 수 있다(예:이름)
    //2. 결과 값을 받을 수 있다.(return을 해주도 데이터타입을 만들어야한다.)
    static String 입장하다(String 이름){//이름 = 매개변수
        System.out.println(이름 + "강의실 입장");
        System.out.println(이름 + "전등 키기");
        System.out.println(이름 + "자리 앉기");
        System.out.println(이름 + "컴퓨터 키기");
        return "OK";
    }

    public static void main(String[] args) {
        String 결과 = 입장하다("홍길동");
        입장하다("서주연");
        입장하다("김철수");
        System.out.println();
        }

    }

