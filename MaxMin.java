import java.util.*;
class MaxMin
{
    static int max,min;
    static int a[];
    static void find(int i,int j)
    {
        int max1,min1,mid;
        if(i==j)
        {                         
            max=min=a[i];
        }
        else
        {
            if(i==j-1)
            {
                if(a[i]<a[j])
                {           
                    max=a[j];
                    min=a[i];
                }
                else
                {
                    max=a[i];
                    min=a[j];
                }
            }
            else
            {                     
                mid=(i+j)/2;
                find(i, mid);
                max1=max;
                min1=min;
                find(mid+1, j);
                
                if(max<max1)
                    max=max1;
                
                if(min>min1)
                    min=min1;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the size of the array: ");
        int n=sc.nextInt();
        a=new int[n];
        System.out.println("\nEnter the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("\nThe array is: "+Arrays.toString(a));
        max=a[0];
        min=a[0];
        find(0, n-1); 
        System.out.println("\nThe max element is: "+max);
        System.out.println("\nThe min element is "+min+"\n");
        sc.close();
    }   
}
