import java.util.Arrays;

public class Prog5{

    public static int[] combine(int[] a, int[] b){
        int length1 = a.length;
        int length2 = b.length;
        int[] result = new int[length1+length2];

        for(int i =0;i<a.length;i++){
            result[i] = a[i];
        }

        int count = a.length;

        for(int j =0; j<b.length;j++){
            result[count] = b[j];
            count++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        int[] c = combine(a, b);
        System.out.print("[");
        if (c.length >= 1) {
            System.out.print(c[0]);
        }
        for (int i = 1; i < c.length; i++) {
            System.out.print(", " + c[i]);
        }
        System.out.print("]");
    }
}
