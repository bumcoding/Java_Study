package Chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2

        System.out.println((double) 5 / 2); // 답이 실수면 실수 형변환
        System.out.println((double) 2 / 4);
        System.out.println(5 % 2); // 나눈 후 나머지 연산

        // 우선 순위 연산
        System.out.println(2 + 3 * 2); // 컴퓨터도 우선 순위을 따진다
        System.out.println((2 + 3) * 2);

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        // 증감 연산 ++, --
        int val = 10;

        System.out.println(val++);
        System.out.println(val);
        System.out.println(++val);
        System.out.println(val);

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
    }
}
