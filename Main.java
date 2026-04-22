import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] table = new int[5];
        Random rand = new Random();
        
        System.out.println("Table with random values:");
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
            System.out.println("Index " + i + ": " + table[i]);
<<<<<<< HEAD
            System.out.println("Nazar`s column");
=======
            System.out.pritln.("Nazar`s column");
>>>>>>> 184df86a55f7ca215301085737d0fef361870a88
        }
        Arrays.sort(table);
        System.out.println("\nSorted table:");
        for (int i = 0; i < table.length; i++) {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Index " + i + ": " + table[i]);
        }
    }
}
