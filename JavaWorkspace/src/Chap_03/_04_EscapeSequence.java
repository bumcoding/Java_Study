package Chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n, \t, \\, \", \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요");

        // 코드 안에서 tap하기 (\t)
        System.out.println("짜장면\t\t5000원");
        System.out.println("탕수육\t\t7000원");
        System.out.println("깐쇼새우\t\t11000원");

        System.out.println("C:\\Program Files\\Java"); // 역슬래시 표현

        System.out.println("난 말했다 \"벌려.\""); // 따옴표 표현
        System.out.println("난 생각했다 \'저녀석... 어머니가 없는걸까?\'"); // 작은따옴표 표현
    }
}
