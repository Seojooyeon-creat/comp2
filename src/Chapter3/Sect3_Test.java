package Chapter3;

import javax.xml.transform.Source;
import java.util.Scanner;
/*
종종 우리는 조건에 따라서 다중으로 분기되는 결정을 내려야 하는 경우가 있다.
학생들의 성적을 입력받아서 학점을 출력하는 프로그램을 작성해 보자.
1.성적이 90점 이상이면 A학점, 80점 이상이고 90점 미만이면 B학점, 70점 이상이고 80점 미만이면 C학점과 같이 결정한다.

실행예
(출력)성적을 입력하시오: (입력)92
(출력)학점: A

 */
public class Sect3_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요.");
        int grade = sc.nextInt();
        String score;
        if(grade >= 90){
            score = "A";
        } else if (grade >= 80 && grade < 90) {
            score = "B";
        } else if (grade >= 70 && grade < 80) {
            score = "C";
        } else {
            score = "F";
        }
        System.out.println(score);
    }
}
