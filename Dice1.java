public class Dice1 {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
    }
    public static int rollDice(){
        double random = Math.random()*6;
        return (int)random +1;
    }

}
