package fuck_sangmin;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 소문자 알파벳 하나를 입력받음
        System.out.print("소문자 알파벳 하나를 입력하시오 : ");
        String english = sc.next();
        char charInput;
        
        // 입력의 길이와 입력값이 소문자 알파벳인지 확인
        if (english.length() == 1 && Character.isLowerCase(english.charAt(0))) {
            charInput = english.charAt(0);
        } else {
            System.out.println("잘못된 입력입니다.");
            sc.close();
            return;
        }

        // a부터 입력받은 알파벳까지 문자열을 생성 및 출력
        for (char ch = charInput; ch >= 'a'; ch--) {
            for (char i = 'a'; i <= ch; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        sc.close();
    }
}

