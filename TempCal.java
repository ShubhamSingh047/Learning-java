import java.util.*;

public class TempCal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter Temp in C: ");
        float tempC = in.nextFloat();
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempF);
    }
}
