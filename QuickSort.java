import java.util.*;
class QuickSort
{
    public void quickSort(int a[],int n, int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        
        int pivot=a[high];
        int i=low;
        int j=high;

        while(i<j)
        {
            while(a[i] <= pivot && i<j)
            {
                i++;
            }
            while(a[j] >= pivot && i<j)
            {
                j--;
            }
            swap(a,i,j);
        }
        swap(a,i,high);
        quickSort(a,n,low,i-1);
        quickSort(a,n,i+1,high);
    }
    public void swap(int a[], int i, int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String args[])
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        QuickSort ss=new QuickSort();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];
        
        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Quick Sorting, Array: "+Arrays.toString(a));
        ss.quickSort(a,n,0,n-1);
        System.out.println("\nAfter Quick Sorting, Array: "+Arrays.toString(a)+"\n"); 
    }
}
