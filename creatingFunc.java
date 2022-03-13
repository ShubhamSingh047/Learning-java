import java.util.*;

public class creatingFunc {
    public static void main(String[] args) {
        sum();
        sum();
    }

    static void sum(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the two num");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}
