import java.util.Random;

public class MainDynamicLinkedList {
    public static void main(String[] args) {
        Random random = new Random();
        Node first = new Node(random.nextInt(100));
        for (int i = 0; i < 30; i++) {
            Random rand = new Random();
            add(first, rand.nextInt(100));
        }
        System.out.println(getInt(first, 16));
        prntNormal(first);
        for(int i = 29; i >= 0; i--) {
            System.out.print(getInt(first, i) + " ");
        }
    }

    public static Node findLast(Node first) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);
        last.next = newElement;
    }

    public static int getInt(Node first, int idx) {
        Node current = first;
        for(int i = 0; current.next != null; i++) {
            if (i == idx) {
                return current.value;
            }
            current = current.next;
        }
        return 0;
    }

    public static void prntNormal(Node first) {
        Node current = first;
        while(current.next != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("");
    }
}