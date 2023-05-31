
public class Prog1 {
    public static void main(String[] args){
        RandomNumbers rn = new RandomNumbers();
        //System.out.println(rn.getRandomInt(1, 9));
        int x = rn.getRandomInt(1,9);
        System.out.println("1. Random x is: " + x + ". PI^num1 is: " + Math.pow(Math.PI,x));
        int y = rn.getRandomInt(3,14);
        System.out.println("2. Random y is: " + y + ". PI^num2 is: " + Math.pow(y,Math.PI));
    }
}

