package DataStructures.Graphs.GraphAlgos;



import java.util.*;

// Edge class
class Edge1 implements Comparable<Edge1> {
    int u, v, weight;

    Edge1(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    // Sorting edges based on weight
    public int compareTo(Edge1 other) {
        return this.weight - other.weight;
    }
}

// Disjoint Set (Union-Find)
class DisjointSet {
    int[] parent;
    int[] rank;

    DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        // Initially every node is its own parent
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    // Find with Path Compression
    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // path compression
        }
        return parent[x];
    }

    // Union by Rank
    void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return; // already connected

        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else if (rank[px] > rank[py]) {
            parent[py] = px;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }
}

public class Kruskal {

    public static void main(String[] args) {

        int n = 5; // number of vertices

        // Edge list
        List<Edge1> edges = new ArrayList<>();
        edges.add(new Edge1(0, 1, 2));
        edges.add(new Edge1(0, 3, 6));
        edges.add(new Edge1(1, 2, 3));
        edges.add(new Edge1(1, 3, 8));
        edges.add(new Edge1(1, 4, 5));
        edges.add(new Edge1(2, 4, 7));
        edges.add(new Edge1(3, 4, 9));

        // Step 1: Sort edges by weight
        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(n);

        int totalWeight = 0;

        System.out.println("Edges in MST:");

        // Step 2: Process edges
        for (Edge1 e : edges) {

            int u = e.u;
            int v = e.v;

            // Step 3: Check cycle
            if (ds.find(u) != ds.find(v)) {

                ds.union(u, v); // connect them

                System.out.println(u + " - " + v + " : " + e.weight);

                totalWeight += e.weight;
            }
        }

        System.out.println("Total Weight of MST: " + totalWeight);
    }
}