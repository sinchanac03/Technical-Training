package DataStructures.Graphs.GraphRepresentation;

public class AdjMatrix
{
        int V; // no of vertices or nodes
        int[][] adjMatrix; // Adjacency Matrix

        AdjMatrix(int vertices){
            this.V = vertices;
            adjMatrix = new int[V][V];
        }
        // unweighted undirected graph
        void addEgde(int u, int v){
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }

        void printAdjMatrix(){
            System.out.println("Adjacency Matrix: ");
            for(int i=0; i<V; i++){
                for(int j=0; j<V; j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    class Driver1{
        public static void main(String[] args) {
            AdjMatrix g = new AdjMatrix(6);
            g.addEgde(5,0);
            g.addEgde(5,4);
            g.addEgde(0,4);
            g.addEgde(0,1);
            g.addEgde(1,4);
            g.addEgde(4,3);
            g.addEgde(1,3);
            g.addEgde(1,2);
            g.addEgde(2,3);
            g.printAdjMatrix();
        }
    }

