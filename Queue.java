import java.util.*;
class Queue 
{
    int f,r,cap;
    int queue[];
    Queue(int size)
    {
        f=r=0;
        cap=size;
        queue=new int[cap];
    }
    void qenqueue(int x)
    {
        if(cap==r)
        {
            System.out.println("Queue is full: ");
            return;
        }
        else
        {
            queue[r]=x;
            r++;
        }
    }
    void qdequeue()
    {
        if(f==r)
        {
            System.out.println("Queue is emptry: ");
            return;
        } 
        else 
        { 
            for (int i = 0; i < r - 1; i++) 
            { 
                queue[i] = queue[i + 1]; 
            }
            r--;
        }
    }
    void display()
    {
        if(f==r)
        {
            System.out.println(" the queue is Empty ");
        }
        for(int i=f;i<r;i++)
        {
            System.out.println("The queue is: "+queue[i]);            
        }   
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the size: ");
        int n=sc.nextInt();
        Queue q=new Queue(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter the elements : ");
            int a=sc.nextInt();
            q.qenqueue(a);
        }
        System.out.print("\nTo Check is queue is empty: ");
        q.display();
        System.out.println("\nafter dequeue: ");
        q.qdequeue();
        q.qdequeue();
        q.display();
        System.out.println();
        sc.close();
    }
}
