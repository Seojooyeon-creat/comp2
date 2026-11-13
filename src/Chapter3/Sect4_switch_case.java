package Chapter3;

import java.util.Scanner;

/*
switch 문은 여러 선택지 중 하나를 고르는 데 특화된 구조로, 마치 자판기에서 “어떤 음료를 선택하시겠습니까?”하고 메뉴를 나열해 주는 것과 같은 역할을 한다.
switch (제어식) {  # 제어문은 결과가 하나의 값으로 나오는 식

    case c1:
        문장 1;
        break;

    case c2:
        문장 2;
        break;

    ...

    default:
        문장 d;
        break;
}
제어문의 예 : 숫자 또는 문자
switch (num) {
    ...
}
구체적인 제어문의 데이터 타입
byte
short
char
int
Byte
Short
Character
Integer
enum
String

아래는 간단한 예
int num = 2;

switch (num) {
    case 1:
        System.out.println("1");
        break;
    case 2:
        System.out.println("2");
        break;
}

스위치케이스 문의 단점은 제어문에 범위를 지정하여 참, 거짓을 판단할 수 없다(제어문에 조건식을 넣을 수 없다)
switch(a>50){# 안됨
    case c1>50 # 안됨
}

Java 7부터는 switch 문의 제어식으로 String 객체를 사용할 수 있다.
String s = "yes";
switch(s) {
	case "yes": ...
		break;
	case "no": ...
		break;
}



예) 성적 결정
성적을 입력하시오: 92
학점: A

 */
public class Sect4_switch_case {
    public static void main(String[] args) {
        int grade = 93;
        String score;
        switch (grade / 10){
            case 10:
                score = "A+";
                break;
            case 9:
                score = "A";
                break;
            case 8:
                score = "B";
                break;
            default:
                score = "C";


        }
        System.out.println(score);
    }
}
