package Chap_06;

public class _02_Parameter {

    public static void power(int num) { // 소괄호 안에는 받을 값의 변수 종류에 따라 다르게 받는다
        int result = num * num;
        System.out.println(num + " 의 2승은 " + result);
    }

    public static void powerByExp(int num1, int num2) { // 세제곱 계산 함수
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        System.out.println(num1 + " 의 " + num2 + "승은 " + result);
    }



    public static void main(String[] args) {
        // 전달값 Parameter


        power(2);
        power(3);
        power(4);


        powerByExp(2, 3);
        powerByExp(3, 3);
        powerByExp(4, 3);
    }
}
