package fuck_sangmin;

public class Number13 {
    public static void main(String[] args) {
        // 1부터 99까지 반복
        for (int i = 1; i < 100; i++) {
            // i를 문자열로 변환
            String number = Integer.toString(i);

            // 문자열 내에 '3', '6', '9'의 개수를 세기
            long count = number.chars().filter(ch -> ch == '3' || ch == '6' || ch == '9').count();

            // 박수 치기
            if (count > 0) {
                System.out.println(i + " / 박수 " + (count == 1 ? "쳐야겠지?" : "두 번 쳐야겠지?"));
            }
        }
    }
}
