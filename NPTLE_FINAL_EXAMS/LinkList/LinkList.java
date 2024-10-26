
import javax.swing.LayoutStyle;

public class LinkList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void removeFirst(){
        size--;
        Node temp = head;
        if(head == null){
            head = tail = null;
            return;
        }
        head = head.next;
    }
    

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void removeLast(){
        
        size--;
        if(head == null){
            head = tail = null;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
            
        }
        temp.next = null;
        tail = head;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        Node newNode = new Node(data);
        Node temp = head;
        size++;
        int i = 0 ;
        while( i < idx - 1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.print();
        list.addFirst(1);
        list.print();

        list.addFirst(2);
        list.print();

        list.addLast(3);
        list.print();

        list.addLast(4);
        list.print();

        list.add(2,7);
        list.print();
        // System.out.println(list);
        System.out.println(list.size);
        list.print();
        list.removeLast();
        list.print();
        System.out.println(list.size);
        list.removeFirst();
        list.print();
        System.out.println(list.size);

    }
}
