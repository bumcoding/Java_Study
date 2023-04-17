package Ch03_OperatorAndFlowControl;
import java.util.Scanner;
public class _03_DWDemo {
    public static void main(String[] args){
        char ch;
        Scanner sc =  new Scanner(System.in);
        do {
            System.out.print("press a key! (stop q)");
            ch = sc.next().charAt(0);
        } while (ch != 'q');
    }
}
