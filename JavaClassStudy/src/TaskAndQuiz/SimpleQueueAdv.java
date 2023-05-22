package TaskAndQuiz;

import java.util.Scanner;

public class SimpleQueueAdv {
    // 여러 함수에서 사용할 구문 전역변수 선언
    private int front;
    private int rear;
    private int capacity;
    private int[] queue;

    // 큐 초기화
    SimpleQueueAdv(int size) {
        front = -1;
        rear = -1;
        capacity = size;
        queue = new int[capacity];
    }

    // 큐가 비어있는지 여부 확인
    boolean isEmpty() {
        return front == -1;
    }

    // 큐가 가득 차 있는지 여부 확인
    boolean isFull() {
        return rear == capacity - 1;
    }

    // 큐에 데이터 넣는 구문
    void enQueue(int data) {
        if (isFull()) {
            // 큐 크기 두배로 늘리기
            int[] newQueue = new int[capacity * 2];
            for (int i = 0; i < capacity; i++) {
                // 늘린 큐의 길이가 기존 큐의 길이만큼 데이터 들어간다는 전제
                newQueue[i] = queue[i];
            }
            queue = newQueue;
            capacity *= 2;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = data;
    }

    // 큐에서 데이터 삭제
    int deQueue() {
        int data = queue[front];

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }

        return data;
    }

    // 큐 출력
    void printQueue() {
        if (isEmpty()) {
            System.out.println("큐가 비어있습니다.");
        } else {
            System.out.print("현재 큐: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleQueueAdv queue = new SimpleQueueAdv(5);

        while (true) {
            System.out.println("======================================");
            System.out.println("1. 저장, 2. 삭제, 3. 큐 출력, 4. 종료");
            System.out.println("======================================");
            System.out.print("메뉴 선택: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    // 0~9가 나온다
                    int data = (int) (Math.random() * 10) + 1;
                    queue.enQueue(data);
                    System.out.println("=======================");
                    System.out.println("큐에 데이터 " + data + " 저장 완료");
                    System.out.println("=======================");
                    break;
                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("==================");
                        System.out.println("큐가 비어있습니다.");
                        System.out.println("==================");
                    } else {
                        int deletedData = queue.deQueue();
                        System.out.println("=========================");
                        System.out.println("큐에서 데이터 " + deletedData + " 삭제 완료");
                        System.out.println("=========================");
                    }
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    System.out.println("==============");
                    System.out.println("프로그램 종료");
                    System.out.println("==============");
                    sc.close();
                    System.exit(0);
                    // 아님 break
                default:
                    System.out.println("================");
                    System.out.println("잘못된 메뉴 선택");
                    System.out.println("================");
            }
        }
    }
}