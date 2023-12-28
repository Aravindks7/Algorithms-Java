import java.util.*;
class BubbleSort
{
    public void bubbleSort(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        int a[],n,i;
        Scanner sc=new Scanner(System.in);
        BubbleSort bs=new BubbleSort();

        System.out.println("\nEnter the limit: ");
        n=sc.nextInt();
        a=new int[n];
        
        System.out.println("\nEnter the elements: ");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("\nBefore Bubble Sorting, Array: "+Arrays.toString(a));
        bs.bubbleSort(a,n);
        System.out.println("\nAfter Bubble Sorting, Array: "+Arrays.toString(a)+"\n");
    }
}
