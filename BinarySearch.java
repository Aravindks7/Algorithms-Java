import java.util.*;
class BinarySearch
{
    public void binarySearch(int a[],int n,int x,int low, int high)
    {
        int mid=(low+high)/2;
        while(low<=high)
        {
            if(x>a[mid])
            {
                low=mid+1;
            }
            else if(x==a[mid])
            {
                System.out.println("\nElement found at "+mid+"\n");
                break;
            }
            else
            {
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        if(low>high)
        {
            System.out.println("\nElement not found\n");
        }
    }
    public static void main(String[] args) 
    {
        int a[],n,i,x;
        Scanner sc=new Scanner(System.in);
        BinarySearch bs=new BinarySearch();
        
        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];

        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("\nUnsorted Array: "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("\nSorted Array: "+Arrays.toString(a));

        System.out.println("\nEnter the element to be searched: ");
        x=sc.nextInt();

        int low=0,high=n-1;
        bs.binarySearch(a,n,x,0,n-1);
    }

}
