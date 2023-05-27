import java.util.Random;
import java.util.Scanner;

class CircularQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;
    private int nItems;

    public CircularQueue(int size) {
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
        if (isFull()) {
            int oldSize = maxSize;
            maxSize *= 2;
            int[] tempArray = new int[maxSize];
            for (int i = 0; i < nItems; i++) {
                tempArray[i] = queueArray[(front + i) % (maxSize / 2)];
            }
            rear = nItems - 1;
            front = 0;
            queueArray = tempArray;
            System.out.println("current size: " + oldSize +  "change size: " + maxSize);
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        nItems++;
    }

    public void dequeue() {
        if (!isEmpty()) {
            int removedItem = queueArray[front];
            front = (front + 1) % maxSize;
            nItems--;
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
        CircularQueue queue = new CircularQueue(5);
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