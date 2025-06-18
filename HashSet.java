import java.util.HashSet;
import java.util.Scanner;

public class HashSet{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter 5 fruits (some can be duplicates):");

        // Read 5 strings from user input and add to the HashSet
        for (int i = 0; i < 5; i++) {
            System.out.print("Fruit " + (i + 1) + ": ");
            String fruit = scanner.nextLine();
            set.add(fruit);
        }
        // Display the unique fruits in the HashSet
        System.out.println("\nUnique fruits entered:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
        scanner.close();
    }
}