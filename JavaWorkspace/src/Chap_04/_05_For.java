package Chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        System.out.println("어서요세요 GUCCI 매장입니다!");
        // 또 다른 손님이 들어오면?
        System.out.println("어서요세요 GUCCI 매장입니다!");
        System.out.println("어서요세요 GUCCI 매장입니다!");
        System.out.println("어서요세요 GUCCI 매장입니다!");
        // 만약 인사 법이 바뀌면?
        System.out.println("환영합니다! GUCCI 매장입니다! 찾아보세요!");
        System.out.println("환영합니다! GUCCI 매장입니다! 찾아보세요!");
        System.out.println("환영합니다! GUCCI 매장입니다! 찾아보세요!");
        // 매장 이름이 바뀌면
        // 구찌 > 입생로랑
        System.out.println("환영합니다! YSL 매장입니다!");

        // 반복문 사용 for
        for (int a = 1; a < 11; a++){
            System.out.println("나는 바보입니다!" + a);
        }

        // 짝수만 출력
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i); // ln을 빼면 한줄로 나열해줌
        }
        System.out.println(); // 줄바꿈

        // 홀수만 출력
        for (int i = 1; i < 10; i+= 2) {
            System.out.print(i);
        }
        System.out.println();

        // 1부터 10까지의 합
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10의 합은 : " + sum);
    }
}
