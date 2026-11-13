package Middle;

import java.util.Scanner;

class Flight {
    int miles;

    public Flight(int miles) {
        this.miles = miles;
    }

    // 거리별 기본 가격(만원)
    int getPrice() {
        if (miles <= 500) return 100;
        else if (miles <= 800) return 150;
        else return 200;
    }

    // 성수기(5~7월)면 장당 50만원 추가, 매수만큼 곱
    int getTotal(String month, int count) {
        int price = getPrice();
        switch (month) {
            case "May", "June", "July" -> price += 50;
            default -> { }
        }
        return price * count;
    }
}

class ManilaFlight extends Flight {
    public ManilaFlight() { super(400); }
}

class NewYorkFlight extends Flight {
    public NewYorkFlight() { super(700); }
}

class LondonFlight extends Flight {
    public LondonFlight() { super(1200); }
}

public class BookingEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(">> 출발일을 입력하세요 (예: 21 May)");
        int day = sc.nextInt();
        String month = sc.next();

        int count;
        while (true) {
            System.out.println(">> 몇장의 티켓을 구매하겠습니까?");
            count = sc.nextInt();
            if (count <= 2) break;
            System.out.println(">> 티켓이 없습니다. 2명이하로 다시입력하세요");
        }

        System.out.println(">> 도착지를 입력하세요");
        String city = sc.next();
        Flight flight;
        switch (city) {
            case "Manila" -> flight = new ManilaFlight();
            case "London" -> flight = new LondonFlight();
            default -> flight = new NewYorkFlight();
        }

        System.out.println(">> 성공적으로 티켓을 구매하셨습니다. 가격은 "
                + flight.getTotal(month, count) + "만원 입니다.");
        sc.close();
    }
}