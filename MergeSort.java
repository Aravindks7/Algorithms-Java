import java.util.*;
class MergeSort
{
    public void mergeSort(int a[])
    {
        int n=a.length;
        if(n<2)
        {
            return;
        }

        int mid=n/2;
        int l[]=new int[mid];
        int r[]=new int[n-mid];

        for(int i=0;i<mid;i++)
        {
            l[i]=a[i];
        }

        for(int i=mid;i<n;i++)
        {
            r[i-mid]=a[i];
        }

        mergeSort(l);
        mergeSort(r);
        merge(a,l,r);
    }
    public void merge(int a[], int l[], int r[])
    {
        int ls=l.length;
        int rs=r.length;
        int i=0,j=0,k=0;

        while(i<ls && j<rs)
        {
            if(l[i]<=r[j])
            {
                a[k]=l[i];
                i++;
            }
            else
            {
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<ls)
        {
            a[k]=l[i];
            i++;
        }
        while(j<rs)
        {
            a[k]=r[j];
            j++;
        }
    }
    public static void main(String[] args)
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        MergeSort ms=new MergeSort();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];
        
        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Merge Sorting, Array: "+Arrays.toString(a));
        ms.mergeSort(a);
        System.out.println("\nAfter Merge Sorting, Array: "+Arrays.toString(a)+"\n"); 
    }
}
