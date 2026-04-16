package DataStructures.Graphs.GraphAlgos;


import java.util.*;

class Edge {
    int node;
    int weight;

    Edge(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class Dijkstra {

    public static void main(String[] args) {

        int n = 6; // nodes: 0 to 5

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // ---- UPDATED GRAPH ----

        // 0 - 1 (4)
        graph.get(0).add(new Edge(1, 4));
        graph.get(1).add(new Edge(0, 4));

        // 0 - 2 (4)
        graph.get(0).add(new Edge(2, 4));
        graph.get(2).add(new Edge(0, 4));

        // 1 - 2 (2)
        graph.get(1).add(new Edge(2, 2));
        graph.get(2).add(new Edge(1, 2));

        // 2 - 3 (3)
        graph.get(2).add(new Edge(3, 3));
        graph.get(3).add(new Edge(2, 3));

        // 2 - 4 (1)
        graph.get(2).add(new Edge(4, 1));
        graph.get(4).add(new Edge(2, 1));

        // 2 - 5 (6)
        graph.get(2).add(new Edge(5, 6));
        graph.get(5).add(new Edge(2, 6));

        // 3 - 5 (2)
        graph.get(3).add(new Edge(5, 2));
        graph.get(5).add(new Edge(3, 2));

        // 4 - 5 (3)
        graph.get(4).add(new Edge(5, 3));
        graph.get(5).add(new Edge(4, 3));

        // ------------------------

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0; // source = 0

        for (int i = 0; i < n; i++) {

            int u = -1;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && dist[j] < min) {
                    min = dist[j];
                    u = j;
                }
            }

            visited[u] = true;

            for (Edge e : graph.get(u)) {
                int v = e.node;
                int w = e.weight;

                if (!visited[v] && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                }
            }
        }

        System.out.println("Shortest distances from source:");

        for (int i = 0; i < n; i++) {
            System.out.println("Node " + i + " -> " + dist[i]);
        }
    }
}
