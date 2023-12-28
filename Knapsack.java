import java.util.*;
class Knapsack
{
    static int max(int a,int b)
    {
        return(a>b) ? a:b;
    }
    static int ksack(int C,int wt[],int p[],int n)
    {
        if(n==0||C<0)
        {
            return 0;
        }
        if(wt[n-1]>C)
        {
            return ksack(C, wt, p, n-1);
        }
        else
        {
            return max(p[n-1]+ ksack(C-wt[n-1], wt, p, n-1),ksack(C, wt, p, n-1));
        }
    } 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\nEnter the capacity: ");
        int c=sc.nextInt();
        System.out.println("\nEnter the size: ");
        int s=sc.nextInt();
        int w[]=new int[s];
        System.out.println("\nEnter the weights.");
        for(int i=0;i<s;i++)
        {
            w[i]=sc.nextInt();
        }
        System.out.println("\nEnter the profit.");
        int p[]=new int[s];
        for(int i=0;i<s;i++)
        {
            p[i]=sc.nextInt();
        }
        System.out.println("\nThe max knapsack is:"+ksack(c, w, p, s)+"units.\n");
        sc.close();
    }
}
