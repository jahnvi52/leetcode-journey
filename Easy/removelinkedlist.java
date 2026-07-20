import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removelinkedlist {

    // Function to insert a node at the end
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

    // Function to remove all nodes having value = val
    static Node removeElements(Node head, int val) {

        // Remove nodes from the beginning
        while (head != null && head.data == val) {
            head = head.next;
        }

        // If list becomes empty
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    // Function to display the linked list
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

        // Number of nodes
        int n = sc.nextInt();

        // Input linked list
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head = insert(head, value);
        }

        // Value to remove
        int val = sc.nextInt();

        // Remove nodes
        head = removeElements(head, val);

        // Display updated list
        display(head);

        sc.close();
    }
}