package Chapter3;
/*
배열(array)은 여러 개의 변수를 하나로 묶어 넣은 것이다.
배열을 사용하면 같은 종류의 대량의 데이터를 한 번에 선언할 수 있다.
배열

• 배열(array)은 여러 개의 변수를 하나로 묶어 놓은 것이다. 배열을 사용하면 같은 종류의 대량의 데이터를 한 번에 선언할 수 있다.
일반변수인 경우
int s0, s1, s2, ..., s9;
배열 선언
int s[10];

배열사용
s[0]  s[1]  s[2]  s[3]  s[4]  s[5]  s[6]  s[7]  s[8]  s[9]

배열은 변수들을 모아놓은 것으로, 하나의 이름을 공유한다.

배열은 동일한 타입의 데이터를 여러 개 저장할 수 있는 저장 장소입니다.

[배열의 선언과 사용]
1. 배열 참조 변수부터 다음과 같이 선언한다. 정수형 배열을 만든다면 배열 참조 변수는 int[] 타입으로 선언하면 된다.
int [] s;
2. 배열 참조 변수부터 다음과 같이 선언한다.
정수형 배열을 만든다면 배열 참조 변수는 int[] 타입으로 선언하면 된다.
s = new int[10]

[주의사항]

참고사항: 배열 선언 시에 크기를 지정하면 안 된다.

배열 선언 시 다음과 같이 배열의 크기를 지정하면 오류가 발생한다.

int[10] s;
int s[10];

배열의 크기는 배열 객체를 생성할 때, 즉 new 연산자를 사용할 때 결정된다.

int[] s = new int[10];


배열의 각각의 요소는 인덱스(index)라는 번호로 접근할 수 있다.
public class ArrayTest1 {

    public static void main(String[] args) {
        int[] s = new int[10];

        for (int i = 0; i < s.length; i++) {
            s[i] = i;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
    }
}


배열을 선언과 동시에 초기화하려면 배열을 선언한 다음에 중괄호를 사용하여 배열 요소의 초깃값을 적어 넣는다.
이때에는 연산자 new를 사용하지 않아도 배열이 생성된다.


public class ArrayTest3 {
       public static void main(String[] args) {

             int[] scores = { 10, 20, 30, 40, 50 };
             for (int i = 0; i < scores.length; i++)
                    System.out.print(scores[i]+" ");
       }
}

 */
public class Sect14_array {
    public static void main(String[] args) {

        // 일반적인 방식
        int [] s = {1, 2, 3, 4};
        System.out.println(s[0]);
        //new를 사용하는 방식 2 가지
        int [] k = new int[5]; //빈칸으로 다섯개를 만드는 법
        k[0] = 1;
        k[1] = 2;
        k[2] = 3;
        k[3] = 4;
        k[4] = 5;

        // for를 이용한 출력 방식
        for(int i = 0; i < 5; i++){
            k[i] = i + 1; //위 문장을 한줄로 배열에 값을 입력
        }

        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]); //for문으로 배열 출력
        }
        String [] m = {"안녕, 미상"};
        double [] n = {4.14, 0.5};
    }
}
