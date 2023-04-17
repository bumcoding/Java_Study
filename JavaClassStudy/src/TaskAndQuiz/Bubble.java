package TaskAndQuiz;
import java.util.Scanner;

// 1~N사이의 값이 중복되지 않게 숫자 값이 들어가되, 랜덤한 인덱스에 저장되도록 배열을 만든다
// 버블 정렬로직을 구현한 bubbleSort함수를 만든다
// 배열 A를 bubbleSort 함수로 오름차순으로 정렬한다
// 1번 배열A와 3번의 정렬된 배열을 둘 다 출력한다. printArray함수를 구현한다

public class Bubble {

    public static void bubbleSort(int[] ary) { // 버블 정렬 함수
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    swap(ary, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] ary, int base, int target) { // 배열을 바꿀때 보관할 함수(수업시간의 reverse 코드 참조)
        int temp = ary[base];

        ary[base] = ary[target];
        ary[target] = temp;
    }

    public static void printArray(int[] array) {
        for (int data : array) { // 조건없이 끝까지 출력하는 for each문
            System.out.print(data + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] index = new int[5];

        System.out.println("인덱스에 넣을 수 : ");

        for (int i = 0; i < index.length; i++) {
            index[i] = sc.nextInt();
        }

        System.out.println("정렬 전");
        printArray(index);
        bubbleSort(index);

        System.out.println(); // 중간 공백

        System.out.println("정렬 후");
        printArray(index);
    }
}
