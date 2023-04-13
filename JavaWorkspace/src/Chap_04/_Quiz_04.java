package Chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int time = 8; // 주차 시간
        boolean smallCar = false;
        boolean pollCar = false;

        int fee = time * 4000;

        // 30000원 초과 시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        if (smallCar || pollCar) {
            fee /= 2; // 50% 할인 적용
        }

        System.out.println("주차 요금은 " + fee + "원 입니다!");
    }
}
