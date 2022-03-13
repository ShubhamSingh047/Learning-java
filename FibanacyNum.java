import java.util.Scanner;

public class FibanacyNum {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int input = inp.nextInt();
        int num1=0;
        int num2=1;
        int sum;
        for(int i = 1; i<input; i++){
            sum = num1+num2;
            System.out.println(sum);
            num1=num2;
            num2=sum;
        }
    }
}
