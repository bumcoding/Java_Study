package Chap_06;

public class _05_Overloading {

    public static int getPower(int num) {
        int result = num * num;

        return result;
    }

    public static int getPower(String strNumber) { // 문자열을 정수로 변환하여 반환하기
        int number = Integer.parseInt(strNumber); // 문자열 > 정수

        return  number * number; // 계산값을 반환
    }

    public static int getPower(int num1, int num2) {
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        return result;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // 전달값의 타입이나 자료, 갯수가 다르다면 똑같은 메소드를 여러번 중복해서 선언 가능
        // 반환형이 다른 형태로는 중복 선언 불가능

        System.out.println(getPower(3));
        System.out.println(getPower("4")); // 문자열이기 때문에 따옴표 처리 해야함
        System.out.println(getPower(3, 3));

    }
}
