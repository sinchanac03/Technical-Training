package DataStructures.Trees.BinaryTrees;

import java.util.Queue;
import java.util.LinkedList;

class Node1
{
    int data;
    Node1 left, right;
    Node1 (int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


    public class BFS
    {
        static Node1 createNode(int val)
        {
            return new Node1(val);
        }


       static void bfs(Node1 root)
       {
           Queue<Node1> q = new LinkedList<>();
           q.offer(root);
           while (!q.isEmpty()) {
               Node1 front = q.poll();
               System.out.print(front.data + " ");
               if (front.left != null) {
                   q.offer(front.left);
               }
               if (front.right != null) {
                   q.offer(front.right);
               }
           }
       }


        public static void main(String[] args) {
            Node1 root=createNode(1);
            root.left=createNode(2);
            root.right=createNode(3);
            root.left.left=createNode(4);
            root.left.right=createNode(5);
            root.right.left=createNode(6);
            root.right.right=createNode(7);
            root.left.right.left=createNode(8);
            root.right.left.left=createNode(15);
            root.right.left.right=createNode(9);
            System.out.print("BFS traversal: " );
            bfs(root);

        }
    }


