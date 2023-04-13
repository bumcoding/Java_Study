package Chap_06;

public class _06_WhenToUse {

    public static int getPower(int num) {

        return getPower(num, 2); // 메소드 안에서 다른 메소드의 계산값을 불러오기도 가능하다
    }

    public static int getPower(int num1, int num2) {
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승 구하기
        int result = 1;

        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        // 3의 3승 구하기
        result = 1;

        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);
        // 간단한 코드를 여러번 반복하는 경우에 코드의 수를 줄이기 위해서
        // 문법은 같고 값만 달라진다면, 메소드를 만들어주는 것이 편리하다

        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        // 메소드 하나로 문장이 간결해짐

        System.out.println(getPower(3, 2)); 
    }
}
