import java.util.*;
class DFS 
{
    static int V;
    static int visitcount = 0;
    private LinkedList<Integer> adj[];
    DFS(int v) 
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
        adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) 
    {
        adj[v].add(w);
    }
    void DFSUtil(int v, boolean visited[]) 
    {
        visited[v] = true;
        System.out.print(v + " ");
        visitcount++;
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) 
        {
            int n = i.next();
            if (!visited[n])
            DFSUtil(n, visited);
        }
    }
    void dfsearch(int v) 
    {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }
    public static void main(String args[]) 
    {
        DFS g = new DFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println("\nFollowing is Depth First Traversal " + "(starting from vertex 2)");
        g.dfsearch(2);
        if (visitcount == V)
            System.out.println("\nThe Graph is Connected.\n");
        else
            System.out.println("\nThe Graph is not connected.\n");
    }
}
