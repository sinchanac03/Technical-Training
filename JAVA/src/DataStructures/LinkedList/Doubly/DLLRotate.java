
package DataStructures.LinkedList.Doubly;

class Node1{
    char data;
    Node1 next;
    Node1 prev;

    Node1(char data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLLRotate {
    Node1 head;

    DLLRotate() {
        head = null;
    }

    void insertAtHead(char val) {
        Node1 n = new Node1(val);
        if (head != null) {
            n.next = head;
            head.prev = n;
        }
        head = n;
    }

    void RotateByN(int N){
        Node1 temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;

        while(N-- > 0){
            head = head.next;
            temp = temp.next;
        }
        temp.next = null;
        head.prev = null;
    }

    void display(){
        Node1 temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Driver1{
    public static void main(String[] args) {
        DLLRotate dll = new DLLRotate();
        dll.insertAtHead('e');
        dll.insertAtHead('d');
        dll.insertAtHead('c');
        dll.insertAtHead('b');
        dll.insertAtHead('a');
        dll.display();
        int N = 3;
        dll.RotateByN(N);
        dll.display();
    }
}
