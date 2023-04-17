package Ch03_OperatorAndFlowControl;

public class _05_EmptyFor {
    public static void main(String[] args){
        int i;
        int sum = 0;
        for (i = 1; i <= 10; sum += i++);
        System.out.println("Sum is " + sum);
    }
}
