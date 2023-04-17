package Ch03_OperatorAndFlowControl;

public class _01_AlphabetPrint {
    public static void main(String[] args) {
        char ch = 'a';
        while(ch <= 'z') {
            ch++;
            System.out.println("char: " + ch);
            //ch++;
        }
    }
}
