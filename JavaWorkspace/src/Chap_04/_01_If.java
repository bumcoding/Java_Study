package Chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If

        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("아샷추는 기본! 샷추가");
        }

        // 오후 2시 이전, 커피를 마시지 않은 경우

        hour = 10;
        boolean morningCoffee = false; // 모닝커피 여부
        if (hour < 14 && morningCoffee == false) // 복수일 경우 and 연산자나 or 연산자 사용
            System.out.println("아이스 아메리카노 +1");

    }
}
