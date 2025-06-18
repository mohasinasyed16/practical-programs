class LinkedList{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class with basic operations
class LinkedList {
    Node head;

    // Insert a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all elements in the list
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class to test the linked list
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Print the list
        System.out.println("Linked List:");
        list.printList();
    }
}
