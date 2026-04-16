package DataStructures.Stacks;

public class ArrayAsStacks
{
    int[] arr;
    int top, size;
    ArrayAsStacks(int size)
    {
        this.size=size;
        top=-1;
        arr=new int[size];
    }
    void push(int val)
    {
        if(top==size-1)
        {
            System.out.println("Stack Overflown");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
            return;
        }
        arr[top]=0; //optional
        top--;
    }
    int Top()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow!");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
}
class Driver
{
    public static void main(String[] args) {
        ArrayAsStacks st=new ArrayAsStacks(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
        st.pop();
        System.out.println(st.Top());
    }
}
