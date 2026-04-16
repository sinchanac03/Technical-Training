package DataStructures.Graphs.GraphTraversal;


import java.util.*;

public class GraphBFS {
    int V;

    GraphBFS(int v){
        this.V=v;
    }

    ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // start from 0
        visited[0] = true;
        while(!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for(int neighbour : adjList.get(front)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return ans;
    }
}

class Driver{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Nodes and Edges: ");
        int n = sc.nextInt();
        int e = sc.nextInt();

        // Adjacency List
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adjList.add(new ArrayList<>());
        }

        // Add the Edges in the Graph and creating ADJLIST
        for(int i=1; i<=e; i++){
            System.out.print("Enter Edge " + i + ": ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }

        GraphBFS bfs = new GraphBFS(n);

        ArrayList<Integer> ans = bfs.bfsTraversal(adjList);
        System.out.println("BFS Traversal: " );
        for(int i : ans){
            System.out.print(+ i + " ");
        }
        sc.close();
    }
}