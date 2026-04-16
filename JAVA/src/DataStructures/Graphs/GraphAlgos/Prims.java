package DataStructures.Graphs.GraphAlgos;

import java.util.*;

public class Prims {

    // Function to calculate MST using Prim's Algorithm
    public static List<int[]> calculatePrimsMST(int n, int m, List<int[]> edges) {

        // Adjacency list: graph[node] = list of {neighbor, weight}
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build graph
        for (int i = 0; i < m; i++) {
            int u = edges.get(i)[0];
            int v = edges.get(i)[1];
            int w = edges.get(i)[2];

            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        // Priority Queue: {weight, node, parent}
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Key array: minimum weight to connect node to MST
        int[] key = new int[n + 1];
        Arrays.fill(key, Integer.MAX_VALUE);

        // Store MST edges: {u, v, weight}
        List<int[]> mstEdges = new ArrayList<>();

        // Start from node 1
        int startNode = 1;
        key[startNode] = 0;

        // push {weight, node, parent}
        pq.offer(new int[]{0, startNode, startNode});

        while (!pq.isEmpty()) {

            int[] top = pq.poll();

            int weight = top[0];
            int u = top[1];
            int parent = top[2];

            // Ignore outdated entries
            if (key[u] != weight) continue;

            // Add edge to MST (ignore first dummy edge)
            if (u != parent) {
                mstEdges.add(new int[]{parent, u, weight});
            }

            // Explore neighbors
            for (int[] neighbor : graph.get(u)) {

                int v = neighbor[0];
                int w = neighbor[1];

                // Relaxation (better edge found)
                if (w < key[v]) {
                    key[v] = w;
                    pq.offer(new int[]{w, v, u});
                }
            }
        }

        return mstEdges;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // test cases

        while (T-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            List<int[]> edges = new ArrayList<>();

            // Input edges
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                int w = sc.nextInt();

                edges.add(new int[]{u, v, w});
            }

            // Call Prim's
            List<int[]> mst = calculatePrimsMST(n, m, edges);

            System.out.println();

            // Print result
            for (int[] edge : mst) {
                System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
            }
        }

        sc.close();
    }
}