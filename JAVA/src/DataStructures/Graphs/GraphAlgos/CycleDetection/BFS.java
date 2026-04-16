package DataStructures.Graphs.GraphAlgos.CycleDetection;



import java.util.*;

// Pair class to store node and its parent
class Pair {
    int node;
    int parent;

    Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}

public class BFS {

    // Function to detect cycle using BFS
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {

        // visited array
        boolean[] visited = new boolean[V];

        // Traverse all components (important for disconnected graph)
        for (int i = 0; i < V; i++) {

            // If not visited, start BFS
            if (!visited[i]) {
                if (bfsCheck(i, adj, visited)) {
                    return true; // cycle found
                }
            }
        }
        return false; // no cycle
    }

    // BFS function
    public static boolean bfsCheck(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        Queue<Pair> queue = new LinkedList<>();

        // Mark start node visited and push into queue
        visited[start] = true;
        queue.add(new Pair(start, -1)); // parent = -1 (no parent)

        while (!queue.isEmpty()) {

            Pair current = queue.poll();
            int node = current.node;
            int parent = current.parent;

            // Traverse all adjacent nodes
            for (int neighbor : adj.get(node)) {

                // If not visited → visit it
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(new Pair(neighbor, node));
                }
                // If visited AND not parent → cycle detected
                else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    // Main method (driver code)
    public static void main(String[] args) {

        int V = 5; // number of vertices

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph)
        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(3).add(4);
        adj.get(4).add(3);

        adj.get(4).add(1); // This creates a cycle

        // Check cycle
        if (isCycle(V, adj)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }
}