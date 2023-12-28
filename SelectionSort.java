import java.util.*;
class SelectionSort
{
    public void selectionSort(int a[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
                int temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
    }
    public static void main(String[] args) 
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        SelectionSort ss=new SelectionSort();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];
        
        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Selection Sorting, Array: "+Arrays.toString(a));
        ss.selectionSort(a,n);
        System.out.println("\nAfter Selection Sorting, Array: "+Arrays.toString(a)+"\n");   
    }
}
