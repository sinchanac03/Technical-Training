package DataStructures.Trees.BinaryTrees;

class Node
{
    int data;
    Node left, right;
    Node (int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}



public class DFS
{
    static Node createNode(int val)
    {
        return new Node(val);
    }

    static void preDFS(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data + " ");
        preDFS(root.left);
        preDFS(root.right);
    }

    static void inDFS(Node root)
    {
        if(root==null)
        {
            return;
        }
        inDFS(root.left);
        System.out.print(root.data + " ");
        inDFS(root.right);
    }

    static void postDFS(Node root)
    {
        if(root==null)
        {
            return;
        }
        postDFS(root.left);
        postDFS(root.right);
        System.out.print(root.data + " ");
    }


    public static void main(String[] args) {
        Node root=createNode(1);
        root.left=createNode(2);
        root.right=createNode(3);
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);
        System.out.print("Pre-order traversal: " );
        preDFS(root);
        System.out.println();
        System.out.print("In-order traversal: ");
        inDFS(root);
        System.out.println();
        System.out.print("Post-order traversal: ");
        postDFS(root);

    }
}
