import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KruskalsAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number of vertices");
        int n = sc.nextInt();

        int[][] cost_matrix = new int[n][n];

        System.out.println("\nEnter the cost adjacency matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost_matrix[i][j] = sc.nextInt();
                if (i == j) {
                    cost_matrix[i][j] = 999;
                }
            }
        }

        int total_cost = kurskal(n, cost_matrix);

        System.out.println("\nTotal cost is " + total_cost);

    }

    private static int kurskal(int n, int[][] cost_matrix) {

        int total_cost = 0;
        ArrayList<Integer> as = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                as.add(cost_matrix[i][j]);
            }
        }
        Collections.sort(as);
        Integer[] cost_set = as.toArray(new Integer[as.size()]);

        ArrayList<Edge> edge_set = new ArrayList<Edge>();
        for (int x = 0; edge_set.size() < n - 1; x++) {
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (cost_matrix[i][j] == cost_set[x]) {
                        Edge e = new Edge(i, j, cost_matrix[i][j]);

                        if (edge_set.isEmpty()) {
                            edge_set.add(e);
                            visited[i] = true;
                            visited[j] = true;
                            break;
                        } else {
                            ArrayList<Edge> copied_arr = new ArrayList<>(edge_set);
                            copied_arr.add(e);
                            boolean flag = false;
                            copied_arr.get(0).visited = true;
                            for (Edge edge : copied_arr) {
                                if (check_cycle(copied_arr, edge)) {
                                    flag = true;
                                }

                            }
                            if (!flag)
                                edge_set.add(e);
                        }
                    }
                }
            }
        }

        System.out.println("Edges are ");
        for (Edge e : edge_set) {
            total_cost += e.cost;
            System.out.println(e.vertex1 + " " + e.vertex2);
        }
        return total_cost;
    }

    private static boolean check_cycle(ArrayList<Edge> copied_arr, Edge start) {

        for (Edge edge : copied_arr) {
            if (start.vertex1 == edge.vertex2) {
                if (edge.visited)
                    return false;
                edge.visited = true;
                return check_cycle(copied_arr, edge);
            }
        }

        return false;
    }

}

class Edge {
    boolean visited;
    int vertex1;
    int vertex2;
    int cost;

    Edge(int vertex1, int vertex2, int cost) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.cost = cost;
        this.visited = false;
    }

    Edge(int vertex1, int vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }
}
