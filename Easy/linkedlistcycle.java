import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linkedlistcycle {

    // Insert at end
    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    // Detect the starting node of the cycle
    static Node detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                // Step 2: Find start of cycle
                Node ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr;
            }
        }

        return null;
    }

    // Display linked list (for normal linked lists)
    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head = null;

        int n = sc.nextInt();

        // Create linked list
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insert(head, value);
        }

        /*
           To create a cycle manually,
           uncomment the following lines.

           Example:
           10 -> 20 -> 30 -> 40 -> 50
                        ^          |
                        |__________|
        */

        // Node temp = head;
        // Node cycleStart = null;

        // while (temp.next != null) {
        //     if (temp.data == 30) {
        //         cycleStart = temp;
        //     }
        //     temp = temp.next;
        // }

        // temp.next = cycleStart;

        Node result = detectCycle(head);

        if (result == null) {
            System.out.println("No Cycle");
        } else {
            System.out.println("Cycle starts at node: " + result.data);
        }

        sc.close();
    }
}