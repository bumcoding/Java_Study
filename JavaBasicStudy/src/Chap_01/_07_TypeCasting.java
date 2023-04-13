package Chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형, 실수형에서 정수형으로 형 변환

        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // float로 인해 실수 형태로 변환
        System.out.println((double) score); // double로 인해 실수 형태로 변환

        // flaot, double에서 int 형변환

        float score_f = 25.9f;
        double score_d = 27.1;

        System.out.println((int) score_f); // int로 소수점 숫자는 모두 버린 뒤 정수 형태
        System.out.println((int) score_d); // int로 소수점 숫자는 모두 버린 뒤 정수 형태

        // 정수 + 실수 연산

        score = 15 + (int) 25.7; // 15 + 25
        System.out.println(score); // 40

        score_d = 30.5 + (double) 10; // 30.5 + 10.0
        System.out.println(score_d); // 40.5

        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 40 > 40.0
        // int > long > float > double (자동으로 형변환)

        int covertedScoreInt = (int) score_d; // 40.5 > 40 (변수 앞에 int를 붙혀야 한다)
        // double > float > long > int (수동으로 형 변환)

        System.out.println(convertedScoreDouble);
        System.out.println(covertedScoreInt);

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // 스트링 라이브러리 사용
        s1 = Integer.toString(93); // 인티저 변환 라이브러리 사용
        System.out.println(s1); // 문자열 93 (숫자 X)

        String s2 = String.valueOf(98.8); // 스트링 라이브러리 사용
        s2 = Double.toString(98.8); // 더블 변환 라이브러리 사용
        System.out.println(s2); // 문자열 98.8 (숫자 X)

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); // 문자열을 정수로 변환
        System.out.println(i); // 숫자 93 (문자열 X)

        double d = Double.parseDouble("98.8"); // 문자열을 실수로 변환
        System.out.println(d); // 숫자 98.8 (문자열 X)

        // int error = Integer.parseInt("자바"); > 자바라는 문자열은 숫자가 될 수 없으므로 오류
    }
}
