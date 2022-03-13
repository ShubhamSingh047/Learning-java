import java.util.*;

public class Calaculate{
    public static void main(String[] args){
        System.out.println("Enter the Bill Amount:- ");
        Scanner bill = new Scanner(System.in);
        double input = bill.nextDouble();
        tipCalac(input);
    }

    static void tipCalac(double tip){
        System.out.println(tip * 0.15);
    }
}