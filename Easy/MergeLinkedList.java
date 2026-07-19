import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeLinkedList {

    // Function to insert node at the end
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

    // Function to merge two sorted linked lists
    static Node merge(Node head1, Node head2) {

        // Dummy node to simplify merging
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (head1 != null) {
            tail.next = head1;
        }

        if (head2 != null) {
            tail.next = head2;
        }

        return dummy.next;
    }

    // Function to print linked list
    static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Node head1 = null;
        Node head2 = null;

        // First linked list
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            head1 = insert(head1, value);
        }

        // Second linked list
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int value = sc.nextInt();
            head2 = insert(head2, value);
        }

        // Merge lists
        Node mergedHead = merge(head1, head2);

        // Display merged list
        display(mergedHead);

        sc.close();
    }
}