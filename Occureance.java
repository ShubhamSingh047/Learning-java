import java.util.*;

public class Occureance {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int count =0;
        while(num>0){
            int rem = num%10;
            if(rem == 4){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
