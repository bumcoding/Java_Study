package Chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)

        String x = "참";
        String y = "거짓";
        String max = (5 > 3) ? x : y;
        System.out.println(max);

        max = (5 < 3) ? x : y;
        System.out.println(max);

        int a = 3;
        int b = 5;

        boolean c = (a == b) ? true : false;
        System.out.println(c);

        String d = (a != b) ? "맞았어요" : "틀렸어요";
        System.out.println(d);
    }
}
