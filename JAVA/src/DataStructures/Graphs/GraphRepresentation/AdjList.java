package DataStructures.Graphs.GraphRepresentation;

import java.util.ArrayList;

public class AdjList
{

        // Adjacency List
        ArrayList<ArrayList<Integer>> adjList;

        AdjList(int vertices){
            adjList = new ArrayList<>();
            for(int i=0; i<vertices; i++){
                adjList.add(new ArrayList<>());
            }
        }

        void addEdge(int u, int v){
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        void printAdjList(){
            for(int i=0; i<adjList.size(); i++){
                System.out.print(i + "->");
                for(int neighbour : adjList.get(i)){
                    System.out.print(neighbour + ", ");
                }
                System.out.println();
            }
        }
    }

    class Driver{
        public static void main(String[] args) {
            AdjList g = new AdjList(6);
            g.addEdge(5,0);
            g.addEdge(5,4);
            g.addEdge(0,4);
            g.addEdge(0,1);
            g.addEdge(1,4);
            g.addEdge(4,3);
            g.addEdge(1,3);
            g.addEdge(1,2);
            g.addEdge(2,3);
            g.printAdjList();
        }
    }

