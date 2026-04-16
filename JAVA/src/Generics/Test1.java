package Generics;

//generics with multiple type inputs
class Test1<K,V>
{

        K key;
        V val;
        Test1( K key, V val ) //constructor
        {
            this.key=key;
            this.val=val;
        }
        void display()
        {
            System.out.println(key + " " + val);
        }

    }
    class Driver1
    {
        public static void main(String[] args)
        {
            Test1<Integer,String> obj1=new Test1<>(100 , "Hello");
            obj1.display();

        }
    }


