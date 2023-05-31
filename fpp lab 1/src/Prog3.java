import static java.lang.System.exit;

// Remove Dups Program
public class Prog3 {
    public static void main(String[] args){
        int count=0;
        String[] animals = {"horse", "dog", "cat", "horse", "dog"};
        String[] noDupsAnimals = new String[animals.length];
        //System.out.println("No Dups Array: " + animals);
        if(animals.length==0){
            exit(0);
        }
        for(int i = 0;i < animals.length; i++){
            boolean isDup = false;
            for(int j=0;j< noDupsAnimals.length;j++) {
                if (noDupsAnimals[j] == animals[i]) {
                    isDup = true;
                    //System.out.println("been here");
                    break;
                }

            }
            if(isDup == false) {
                noDupsAnimals[count] = animals[i];
                count++;
            }

        }
        System.out.print("[ ");
        if (noDupsAnimals.length >= 1) {
            System.out.print(noDupsAnimals[0]);
        }

        for (int i = 1; i < noDupsAnimals.length; i++) {
            System.out.print(", " + noDupsAnimals[i]);
        }
        System.out.print("]");
    }
}
