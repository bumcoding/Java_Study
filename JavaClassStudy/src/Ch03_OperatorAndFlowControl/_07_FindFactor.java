package Ch03_OperatorAndFlowControl;

public class _07_FindFactor {
    public static void main(String[] args){
        for (int i = 2; i <= 100 ; i++){
            System.out.print("Factors of " + i + "; ");
            for (int j=2; j<i ; j++){
                if ((i%j) == 0){
                    System.out.print(j +" ");
                }
            }
            System.out.println();
        }
    }
}
