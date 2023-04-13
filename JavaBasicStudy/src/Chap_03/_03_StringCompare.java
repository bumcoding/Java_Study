package Chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true 다르면 false
        System.out.println(s1.equals(s2)); // 문자열 내용이 같으면 true 다르면 false

        System.out.println(s2.equals("python")); // 대소문자가 구분됨
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 내용만 판별

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234"; // s1과 s2가 같은 메모리 안에 들어있다 (참조)
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234"); // s1과 s2를 서로 다른 메모리에 저장됨

        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // false (참조 비교)
    }
}
