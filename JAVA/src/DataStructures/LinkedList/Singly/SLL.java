package DataStructures.LinkedList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head==null){
            head = n;
            return ;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSize(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        int size = getSize();
        Node n = new Node(val);
        if(pos<0 || pos>size){
            System.out.println("Invalid Position Given!");
        }else if(pos==0){
            n.next = head;
            head = n;
        }else{
            Node temp = head;
            while(--pos>0){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }

    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("Get Lost!");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null;
    }

    void deleteByValue(int val){
        if(head==null){return;}

        if(head.data==val){
            deleteAtHead();
            return;
        }

        Node temp = head;
        while(temp.next!=null && temp.next.data!=val){
            temp = temp.next;
        }

        if(temp.next == null){
            System.out.println("Value is not found");
            return ;
        }

        Node toDelete = temp.next;
        temp.next = temp.next.next;
        toDelete = null;

    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class Driver{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtTail(1000);
        sll.display();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.insertAtHead(60);
        sll.display();
        sll.insertAtPos(5000, 2);
        sll.display();
        sll.deleteAtHead();
        sll.display();
        sll.deleteByValue(5000);
        sll.display();
        sll.deleteByValue(500);
        sll.display();
        sll.deleteByValue(50);
        sll.display();
    }
}