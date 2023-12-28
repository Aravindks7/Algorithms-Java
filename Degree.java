import java.util.Scanner;

public class Degree
{
    void vertices(int G[][],int n)
    {
        int i,j,degree=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(G[i][j]!=99)
                {
                    degree++;
                }
            }
            System.out.println("\n Degree Of Vertex "+(i+1)+" is "+degree);        
            degree=0;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int G [][]= new int[20][20];
 
        System.out.println("\nEnter no. of vertices:");
        int n = sc.nextInt();
 
        System.out.println("\nEnter Adjacent Matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                G[i][j]=sc.nextInt();
            }
        }       
        Degree dv = new Degree();
        dv.vertices(G,n);
        System.out.println();
        sc.close();
    }
}
