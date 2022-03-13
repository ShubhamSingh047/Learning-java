import java.util.*;

public class Looping {
    public static void main(String[] agrs){
        Scanner inn = new Scanner(System.in);
        int input = inn.nextInt();

        for(int num = input; num>=0; num--){
            System.out.println(num);
        }
    }           
}
