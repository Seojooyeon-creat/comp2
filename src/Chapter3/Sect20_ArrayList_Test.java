package Chapter3;

import java.util.ArrayList;

/*
ArrayList에 대한 완전한 설명은 11장에서 하지만 다음 장부터 가끔씩 ArrayList를 사용해 보자.
어렵지 않다. 다음과 같은 문장으로 문자열(String)을 저장할 수 있는 ArrayList를 생성한다.

      ArrayList에 저장할 자료형
                    │
                    ▼
ArrayList<String> list = new ArrayList<>();
         ▲                     ▲
         │                     │
         │                     └── ArrayList 생성
         │
         └── 문자열을 저장하는 ArrayList 참조 변수 선언


list.add("Apple");
list.add("Grape");




[Test]
친구 리스트를 저장하는 ArrayList를 만들고, 친구들의 이름을 저장한 후에 다시 꺼내서 화면에 출력해보자.
철수 영희 순신 자영

 */
public class Sect20_ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));

        }
    }

}

