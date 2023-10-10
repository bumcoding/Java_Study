package fuck_sangmin;

import java.util.Scanner;

public class Number14 {
    public static void main(String[] args) {
        String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" }; // 대소문자, 띄어쓰기 호환 X
        int[] score = { 95, 88, 76, 62, 55 };

        Scanner scanner = new Scanner(System.in);

        // 그만 입력 전까지 무한루프
        while (true) {
            System.out.print("과목 이름 : ");
            String input = scanner.nextLine();

            if ("그만".equals(input)) {
                break;
            }

            int index = -1;
            for (int i = 0; i < course.length; i++) {
                if (course[i].equals(input)) {
                    index = i;
                    break;
                }
            }

            // 일치하는 과목이 있을 시 출력
            if (index != -1) {
                System.out.println(course[index] + "의 점수 : " + score[index]);
            } else {
                System.out.println("해당 과목은 없는 과목입니다.");
            }
        }

        scanner.close();
    }
}
