public class ReverseNum {
    public static void main(String args[]) {
        int num =10345;
        int numLen =0 ;
        while(num>0){
            numLen=num%10;
            System.out.print(numLen);
            num/=10;
        }
        
    }
}
