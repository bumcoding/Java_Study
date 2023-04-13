package Chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Lesserafim team and favorite is Chaewon.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // "and"를 ","로 변환
        System.out.println(s.substring(7)); // index 7부터 시작
        System.out.println(s.substring(s.indexOf("team")));
        System.out.println(s.substring(s.indexOf("team"), s.indexOf("."))); // 시작위치부터 끝위치 직전까지

        // 공백 제거
        s = "           I love chaewon            ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
