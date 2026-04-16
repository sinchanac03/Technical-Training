package GarbageCollection.Demo;


public class DemoGC {

        public void finalize(){
            System.out.println("Garbage Collected!");
        }

        public static void main(String[] args) {
            for(int i=0; i<10000; i++){
                DemoGC obj = new DemoGC();
                obj = null;
            }
            System.gc();
        }
    }

