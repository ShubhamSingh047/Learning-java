
import java.util.*;

public class QestionChar {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);

        if(ch>='a' && ch <= 'z'){
            System.out.println(ch +" lower");
        }else{
            System.out.println(ch +" Captial");
        }
    }
}
