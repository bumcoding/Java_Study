import java.util.Scanner;
import java.util.Random;

class Queue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public Queue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(int value) {
        if (isFull()) {
            int oldSize = maxSize;
            maxSize *= 2;
            int[] tempArray = new int[maxSize];
            System.arraycopy(queueArray, 0, tempArray, 0, oldSize);
            queueArray = tempArray;
            System.out.println("current size: " + oldSize + ", change size: " + maxSize);
        }
        queueArray[++rear] = value;
    }

    public void dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front++];
            System.out.println("삭제된 값: " + removedItem);
        } else {
            System.out.println("큐가 비어있습니다.");
        }
    }

    public void displayQueue() {
        if (!isEmpty()) {
            System.out.print("length: " + maxSize + ", ");
            System.out.print("rear: " + rear + ", ");
            System.out.print("front: " + front + ", ");
            System.out.print("element: [");
            for (int i = front; i <= rear; i++) {
                if (i != rear) {
                    System.out.print(queueArray[i] + ", ");
                } else {
                    System.out.print(queueArray[i]);
                }
            }
            System.out.println("]");
        } else {
            System.out.println("큐가 비어있습니다.");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
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