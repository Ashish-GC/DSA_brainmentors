

import java.util.*;

class Solution {
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node(0); // Dummy node to initialize the result linked list
        Node curr = dummy; // Current node to traverse and build the result linked list
        int carry = 0; // Carry value for addition

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Initialize sum as the carry value

            // Add values from both linked lists (if available)
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10; // Calculate the carry for the next digit
            curr.next = new Node(sum % 10); // Create a new node with the digit sum
            curr = curr.next; // Move to the next node in the result linked list
        }

        return dummy.next; // Return the result linked list
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int val = sc.nextInt();

        Node first = new Node(val);
        Node tail = first;
        for (int i = 0; i < n - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        int m = sc.nextInt();
        val = sc.nextInt();

        Node second = new Node(val);
        tail = second;
        for (int i = 0; i < m - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        Solution g = new Solution();
        Node res = g.addTwoNumbers(first, second);
        printList(res);
    }

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
