import java.util.*;
class Stack 
{
    int arr[];
    int top;
    int capacity;
    
    Stack(int n)
    {
        arr=new int[n];
        capacity=n;
        top=-1;
    }
    public void push(int x)
    {
        if(isfull())
        {
            System.out.println("Overflow");
            System.exit(1);            
        }
        else
        {
            System.out.println("Insert: "+x);
            arr[++top]=x;
        }
    } 
    public int pop()
    {
        if(isempty())
        {
            System.out.println("Empty");
            System.exit(1);
        }
        return arr[top--];
    }
    Boolean isempty()
    {
        return top == -1;
    }
    int getSize()
    {
        return top+1;
    }
    public Boolean isfull()
    {
        return top==capacity-1;
    }
    public void printStack()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the size: ");
        int n=sc.nextInt();
        Stack stck=new Stack(n);
        for(int i=0;i<n;i++)
        {    
            System.out.println("\nEnter the elements of the stack: ");
            int a=sc.nextInt();
            stck.push(a);
        }
        System.out.println("\nThe initial stack is: ");
        stck.printStack();
        stck.pop();
        stck.pop();
        System.out.println("\nThe stack after pop operation is: ");
        stck.printStack();
        System.out.println();
        sc.close();
    } 
}
