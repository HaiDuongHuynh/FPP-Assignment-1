import static java.lang.System.exit;

public class Prog6 {
    static int min(int[] arrayOfInts){
        if(arrayOfInts == null){
            exit(0);
        }
        int minimum = arrayOfInts[0];
        for(int i =0;i< arrayOfInts.length;i++){
            if(minimum > arrayOfInts[i]){
                minimum = arrayOfInts[i];
            }
        }

        return minimum;
    }
    public static void main(String[] args) {
        int[] array = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("Minimum of this array is: " + min(array));
    }
}
