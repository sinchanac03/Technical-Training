package DataStructures.Trees.BinarySearchTree;


class Node {
    int key;
    Node left;
    Node right;

    Node(int key) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}
public class BST
{
    Node root;

    //default constructor
    BST()
    {
        root=null;
    }
    //helper insert function
    private Node insertRec(Node root,int key)
    {
        if(root==null)
        {
            return new Node(key);
        }
        if(key<root.key)
        {
            root.left=insertRec(root.left,key);
        }
        else if(key>root.key)
        {
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    //main callable
    public void insert(int key)
    {
        root=insertRec(root,key);
    }

}


class Driver
{
    public static void main(String[] args) {
        BST bst=new BST();
        bst.insert(100);
        bst.insert(80);
        bst.insert(50);



    }
}