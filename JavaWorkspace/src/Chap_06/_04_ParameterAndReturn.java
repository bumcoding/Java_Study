package Chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int num) {
        int result = num * num;

        return result;
    }

    public static int getPowerByExp(int num1, int num2) {
        int result = 1;

        for (int i = 0; i < num2; i++) {
            result *= num1;
        }

        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드

        int retVal = getPower(2); // 2에 대한 계산 값을 함수로 불러옴
        System.out.println(retVal);

        System.out.println(getPower(3)); // 값을 바로 불러와도 됨


        retVal = getPowerByExp(3, 3); // 세제곱 계산하는 함수를 불러옴
        System.out.println(retVal);

        System.out.println(getPowerByExp(4, 3));
    }
}
