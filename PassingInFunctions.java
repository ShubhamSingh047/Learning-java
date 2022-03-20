import java.util.Arrays;

class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        System.out.println(Arrays.toString(nums));
        Change(nums);
        System.out.println(Arrays.toString(nums));
    }   
    static void Change(int[] arr){
        arr[0] = 99;
    } 
}

