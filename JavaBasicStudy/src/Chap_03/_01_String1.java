package Chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 문자열의 길이 출력

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 모두 대문자로
        System.out.println(s.toLowerCase()); // 모두 소문자로

        // 포함 관계
        System.out.println(s.contains("Java")); // 포함되면 true 포함되지 않으면 false
        System.out.println(s.contains("Intel")); // 포함되면 true 포함되지 않으면 false

        System.out.println(s.indexOf("Java")); // 위치 정보 (0부터 시작해서)
        System.out.println(s.indexOf("Intel")); // 포함되지 않으면 -1

        System.out.println(s.indexOf("and")); // 처음 위치하는 정보
        System.out.println(s.lastIndexOf("and")); // 마지막 위치하는 정보

        System.out.println(s.startsWith("I like")); // 맞다면 true 아니면 false
        System.out.println(s.endsWith(".")); // 맞다면 true 아니면 false
    }
}
