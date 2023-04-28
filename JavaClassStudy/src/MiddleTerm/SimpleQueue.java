import java.util.Scanner;
import java.util.Random;

class SimpleQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int nItems;

    public SimpleQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
        nItems = 0;
    }

    public boolean isFull() {
        return nItems == maxSize;
    }

    public boolean isEmpty() {
        return nItems == 0;
    }

    public void enqueue(int value) {
        if (!isFull()) {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = value;
            nItems++;
        } else {
            System.out.println("큐가 가득 찼습니다.");
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front++];
            if (front == maxSize) {
                front = 0;
            }
            nItems--;
            System.out.println("삭제된 값: " + removedItem);
        } else {
            System.out.println("큐가 비어있습니다.");
        }
    }

    public void displayQueue() {
        if (!isEmpty()) {
            System.out.print("element: [");
            int index = front;
            while (index != rear) {
                System.out.print(queueArray[index] + ", ");
                index = (index + 1) % maxSize;
            }
            System.out.println(queueArray[rear] + "]");
        } else {
            System.out.println("큐가 비어있습니다.");
        }
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 저장\n2. 삭제\n3. 큐 출력\ns. stop");
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("s")) {
                System.out.println("프로그램 종료.");
                break;
            }

            int menu = Integer.parseInt(input);

            switch (menu) {
                case 1:
                    int randomNumber = rand.nextInt(500) + 1;
                    System.out.println("저장할 값: " + randomNumber);
                    queue.enqueue(randomNumber);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}