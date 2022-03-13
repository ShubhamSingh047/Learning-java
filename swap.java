public class swap {
    public static void main(String args[]) {
        int a =10;
        int b= 20;
        swapfunc(a,b);
        System.out.println(a,b);
    }

    static void swapfunc(int i, int j){
        int temp =i;
        i=j;
        j=temp;
    }
}
