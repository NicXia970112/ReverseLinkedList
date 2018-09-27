import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.awt.*;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        List l = new List();
        l.insert(node1);
        l.insert(node2);
        l.insert(node3);
        l.insert(node4);
        l.insert(node5);
        l.print();
        List newList = l.reverse();
        newList.print();
    }

}

class Node {

    public Node next;

    public int val;

    Node(int value) {
        this.val = value;
    }

}

class List {

    public Node head;

    public Node tail;

    public int size = 0;

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.print(p.val + "   ");
            p = p.next;
        }
        System.out.println();
    }

//    public void insert(Node n) {
//        if(head == null) {
//            head = n;
//        }
//        else {
//            n.next = head;
//            head = n;
//        }
//    }

    public void insert(Node n) { //头插
        n.next = head;
        head = n;
    }

    public List reverse() {
        Node p = head;
        Node newHead = p.next;
        List l = new List();
        while (newHead != null) {
            l.insert(p);
            p = newHead;
            newHead = newHead.next;
            if(newHead == null) {
                l.insert(p);
            }
        }
        return l;
    }



}
