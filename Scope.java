public class Scope {
    static int Dog = 55; //global scope
    public static void main(String[] args){
        System.out.println(Dog);
        someFunction();
    }
    public static void someFunction(){
        System.out.println(Dog);
    }
}
