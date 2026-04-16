package DataStructures.Trees.BinaryTrees;

class Node2
{
    int data;
    Node2 left, right;
    Node2 (int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class HeightOfTree
{
    static Node2 createNode(int val)
    {
        return new Node2(val);
    }
    static int height(Node2 root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }
    public static void main(String[] args)
    {
        Node2 root=createNode(1);
        root.left=createNode(2);
        root.right=createNode(3);
        root.left.left=createNode(4);
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);
        System.out.print("Height Of Tree= ");
        System.out.println(height(root));


    }
}



