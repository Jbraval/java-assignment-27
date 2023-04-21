import java.util.*;
 
class Node {
    public int data;
    public Node next;
 
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
 
class LinkedList {
    public Node head = null, tail = null;
 
    public void insert(int val) {
        if (head == null) {
            head = tail = new Node(val);
            return;
        }
        tail.next = new Node(val);
        tail = tail.next;
    }
 
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if(curr.next != null)
                System.out.print("->");
            curr = curr.next;
        }
    }
}
 
public class Test3 {
    public static void printCount(Node head) {
        int odd = 0, even = 0;
        while (head != null) {
            if (head.data % 2 == 1) {
                odd++;
            } else {
                even++;
            }
            head = head.next;
        }
        System.out.println("Odd = " + odd);
        System.out.println("Even = " + even);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList ll = new LinkedList();
        for (int i = 0; i < n; i++) {
            ll.insert(sc.nextInt());
        }
        printCount(ll.head);
    }
}
 
