import java.util.*;
public class DijkstraAlgo 
{
    public static void dijkstra(int[][] graph, int source) 
    {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
     
        Arrays.fill(visitedVertex,false);
        Arrays.fill(distance,999);

        distance[source] = 0;
        for (int i = 0; i < count; i++) 
        {
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;
        
            for (int v = 0; v < count; v++) 
            {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) 
                {
                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }
        for (int i = 0; i < distance.length; i++) 
        {
            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
        }
  
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) 
    {
        int minDistance = 999;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) 
        {
            if (!visitedVertex[i] && distance[i] < minDistance) 
            {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }
  
    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the number of vertices");
        int n=sc.nextInt();
  
        int[][] cost_matrix = new int[n][n];
          
        System.out.println("\nEnter the cost adjacency matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                cost_matrix[i][j] = sc.nextInt();
                if(i==j)
                {
                    cost_matrix[i][j]=999;
                }
            }
        }    
        DijkstraAlgo T = new DijkstraAlgo();
        T.dijkstra(cost_matrix, 0);
        System.out.println();
    }
}
