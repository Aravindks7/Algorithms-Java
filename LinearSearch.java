import java.util.*;
class LinearSearch
{
    public void Search(int a[],int n,int x)
    {
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                flag=1;
                System.out.println("\nElement is found at index "+i+"\n");
            }
        }
        if(flag==0)
        {
            System.out.println("\nElement is not found\n");
        }
    }
    public static void main(String[] args) 
    {
        int a[],n,i,x;
        Scanner sc=new Scanner(System.in);
        LinearSearch s=new LinearSearch();
        
        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nEnter the element to be searched: ");
        x=sc.nextInt();

        s.Search(a,n,x);
    }
}
