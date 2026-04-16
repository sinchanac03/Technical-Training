package DataStructures.Stacks;

class Node
{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }


   public class LinkedListAsStack
   {

        Node top;

        void push(int val)
        {
            Node n = new Node(val);
            n.next = top;
            top = n;
            System.out.println(val + " pushed into stack");
        }


        void pop()
        {
            if (top == null)
            {
                System.out.println("Stack Underflow");
                return;
            }

            System.out.println(top.data + " popped from stack");
            top = top.next;
        }

        void peek()
        {
            if (top == null)
            {
                System.out.println("Stack is empty");
                return;
            }

            System.out.println("Top element is: " + top.data);
        }


        void display()
        {
            if (top == null)
            {
                System.out.println("Stack is empty");
                return;
            }

            Node temp = top;

            while (temp != null)
            {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }

            System.out.println("NULL");
        }
    }


     class Driver1
     {

        public static void main(String[] args)

        {

            LinkedListAsStack s = new LinkedListAsStack();

            s.push(10);
            s.push(20);
            s.push(30);

            System.out.println("Stack elements:");
            s.display();

            s.peek();

            s.pop();

            System.out.println("Stack after pop:");
            s.display();
        }
    }

