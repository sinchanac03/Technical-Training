package DataStructures.Graphs.Graph_Algos;

public class DisjointSetExample {

    // Disjoint Set Class
    static class DisjointSet {

        int[] parent;

        // Constructor
        DisjointSet(int n) {
            parent = new int[n + 1];

            // Initially each node is its own parent
            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }
        }

        // Find with Path Compression
        int find(int x) {
            if (parent[x] == x) {
                return x;
            }
            return parent[x] = find(parent[x]); // path compression
        }

        // Union operation
        void union(int x, int y) {
            int parentX = find(x);
            int parentY = find(y);

            // If already in same set
            if (parentX == parentY) {
                return;
            }

            // Attach one tree to another
            parent[parentY] = parentX;
        }
    }

    // Main Method (Execution starts here)
    public static void main(String[] args) {

        DisjointSet ds = new DisjointSet(6);

        // Perform unions
        ds.union(1, 2);
        ds.union(2, 3);
        ds.union(4, 5);

        // Check groups
        System.out.println("Leader of 1: " + ds.find(1));
        System.out.println("Leader of 3: " + ds.find(3));

        System.out.println("Leader of 4: " + ds.find(4));
        System.out.println("Leader of 5: " + ds.find(5));

        // Check if two nodes are in same set
        if (ds.find(1) == ds.find(3)) {
            System.out.println("1 and 3 are in same set");
        }

        if (ds.find(1) != ds.find(5)) {
            System.out.println("1 and 5 are in different sets");
        }
    }
}