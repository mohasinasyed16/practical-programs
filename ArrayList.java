import java.util.ArrayList;
public class ArrayList{
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display the ArrayList
        System.out.println("Fruits: " + fruits);

        // Get element at index 1
        System.out.println("Element at index 1: " + fruits.get(1));

        // Remove element "Banana"
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate over the ArrayList
        System.out.println("Iterating over fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Ch
