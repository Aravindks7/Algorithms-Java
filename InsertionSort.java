import java.util.*;
class InsertionSort
{
    public void insertionSort(int a[], int n)
    {
        for(int i=1;i<n;i++)
        {
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
    }
    public static void main(String args[])
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        InsertionSort ss=new InsertionSort();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];
        
        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Insertion Sorting, Array: "+Arrays.toString(a));
        ss.insertionSort(a,n);
        System.out.println("\nAfter Insertion Sorting, Array: "+Arrays.toString(a)+"\n");  
    }
}
