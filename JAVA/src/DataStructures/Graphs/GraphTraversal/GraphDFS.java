package DataStructures.Graphs.GraphTraversal;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFS {
    // private rec dfs backend ()
    private void dfsRec(int srcnode, ArrayList<ArrayList<Integer>> adjList,  boolean[] visited, ArrayList<Integer> ans){
        visited[srcnode] = true;
        ans.add(srcnode);

        for(int neighbour : adjList.get(srcnode)){
            if(!visited[neighbour]){
                dfsRec(neighbour, adjList,visited,ans);
            }
        }
    }
    // public visible main dfs callable ()
    ArrayList<Integer> dfsTraversal(int n, ArrayList<ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        dfsRec(0, adjList, visited, ans);
        return ans;
    }
}

class Driver1{
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

        GraphDFS dfs = new GraphDFS();

        ArrayList<Integer> ans = dfs.dfsTraversal(n, adjList);
        System.out.println("DFS Traversal: " );
        for(int i : ans){
            System.out.print(+ i + " ");
        }
        sc.close();
    }
}

