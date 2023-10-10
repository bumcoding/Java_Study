package fuck_sangmin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Number8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 정수 개수 입력
        System.out.print("정수 몇개? ");
        int number = scanner.nextInt();

        // 입력받은 정수의 범위 확인
        if(number <= 0 || number >= 100) {
            System.out.println("잘못된 입력입니다. 100보다 작은 양의 정수를 입력하세요.");
            scanner.close();
            return;
        }

        // 1부터 100까지의 정수 리스트 생성
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        // 리스트의 요소를 무작위로 섞음
        Collections.shuffle(numbers);

        // 입력받은 개수만큼의 정수를 배열에 할당
        int[] randomIntegers = new int[number];
        for (int i = 0; i < number; i++) {
            randomIntegers[i] = numbers.get(i);
        }

        // 배열 출력
        for (int i : randomIntegers) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
