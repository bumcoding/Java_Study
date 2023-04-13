package Chap_06;

public class _07_VariableScope {

    public static void methodA() {
//        System.out.println(num);
//        System.out.println(result);
        // 다른 메소드에 선언한 변수들 다른 메소드에서는 사용이 불가능하다
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int num = 3;

//        System.out.println(result);

        for (int i = 0; i < 5; i++) {  // 함수 for 안에서 i를 선언함
            System.out.println(i);
        }

//        System.out.println(i);
        // for라는 함수 안에서만 변수 i를 선언했기 때문에 밖에서는 사용 못함

        {
            int j = 0;
            System.out.println(j); // 괄호 속에 선언한 숫자는 출력 됨
            System.out.println(num);
        }
//        System.out.println(j); // 괄호 속에서 선언한 숫자를 밖에서는 출력이 안됨
    }
}
