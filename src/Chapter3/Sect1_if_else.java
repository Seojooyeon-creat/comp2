package Chapter3;

import java.util.Scanner;

/*
1. 목표
조건에 따라 서로 다른 문장을 실행하는 코드를 작성한다.
조건에 따라 반복하는 코드를 작성한다.
자바에서 배열을 생성하고 배열 안에 값을 저장한다.
자바에서 2차원 배열을 생성하고 사용한다.
ArrayList를 생성하고 값을 저장한다.

2. if - else 문
조건에 따라서 서로 다른 처리를 하고 싶을 때 사용하는 구조가 if-else 문이다

       │
       ▼
     /   \
   /       \
  /  상품의  \  거짓
 <    가격    > ────────────────────┐
  \  > 20000 /                      │
   \       /                        │
     \   /                          │
       │                            │
       │ 참                         ▼
       ▼                     ┌──────────────┐
┌──────────────┐             │ 배송비 = 3000 │
│ 배송비 = 0    │             └──────┬───────┘
└──────┬───────┘                    │
       │                            │
       └──────────────┬─────────────┘
                      │
                      ▼
                    참 or 거짓

 코드로

 if(price>2000){
    ShippingCost=0
 }else{
    ShippingCose=3000
 }


 실습문제
 (출력)점수를 입력하세요:(입력)2
 (출력:짝수,홀수를 구분)입력된 점수는 짝수입니다.
 */
public class Sect1_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("점수를 입력하세요.");
        score = sc.nextInt();

        if(score % 2 == 0){
            System.out.println("짝수입니다.");
        }
        else{
            System.out.println("홀수입니다.");
        }
//        System.out.println("가격을 넣으세요.");
//        int price = sc.nextInt();
//
//        if(price > 20000){
//            System.out.println("배송료가 없습니다.");
//        }
//        else{
//            System.out.println("배송료가 3000원입니다.");
//        }
    }

}
