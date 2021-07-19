package Custom;

import Bank.Cust;

class Node {
    int d;
    Node next;

    public Node(int d) {
        this.d = d;
    }

}
public class CustomLL {

    private static Node head;
    Node addLast(int x) {
        Node a = new Node(x);
        if(head==null)
            return a;
        Node cur = head;
        while(cur.next == null)
            cur=cur.next;
        cur.next=a;
        return head;
    }

    Node addFirst(int x) {
        Node a = new Node(x);
        Node temp=head;
        head=a;
        head.next=temp;
        return head;
     }

     Node delete(int x) {
        if(head==null)
            return null;

        if(head.d==x)
            return head.next;

        Node prev=head;
        Node cur = head;
        while(cur.next!=null) {
            if(cur.d == x) {
                prev.next=cur.next;
                return head;
            }
            prev=cur;
            cur=cur.next;
        }
        return null;
     }

     void printLL() {
        if(head==null)
            return;
        Node cur = head;
        while(cur!=null) {
            System.out.println(cur.d);
            cur = cur.next;
        }
     }

    public static void main(String[] args) {
        CustomLL ll = new CustomLL();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(50);
        ll.addLast(200);
        ll.addLast(10);
        ll.printLL();
        ll.delete(30);
        ll.printLL();


    }

}


