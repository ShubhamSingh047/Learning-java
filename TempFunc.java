public class TempFunc {
    public static void main(String[] args) {
        double result = Convert(22.3);
        System.out.println(result);
    }

    static double Convert(double tempF){
        return tempF * 9/5 + 32;
    }
}
  