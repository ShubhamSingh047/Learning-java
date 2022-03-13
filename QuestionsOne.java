//largest number

import java.util.Scanner;
public class QuestionsOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num 1:- ");
        int num1 = input.nextInt();
        System.out.println("Enter num 2:- ");
        int num2 =input.nextInt();
        System.out.println("Enter num 3:- ");
        int num3 =input.nextInt();

        if(num1 > num2 && num1>num3){
            System.out.println(num1 +" is Biggest");
        }else if(num2 > num1 && num2>num3){
            System.out.println(num2 +" is Biggest");
        }else{
            System.out.println(num3 +" is Biggest");
        }
        
    }
}
