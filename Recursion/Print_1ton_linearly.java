import java.util.Scanner;
class Print_1ton_linearly {
    public static void print(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        print(i+1,n);

    }
    public static void reverse(int n)
    {
        if(n ==0)
        {
            return;
        }
        System.out.print(n+" ");
        reverse(n-1);
    }
    public static void printbacktracking(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        printbacktracking(i-1, n);
        System.out.print(i+ " ");
    }
    public static void reverseprintbacktracking(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        reverseprintbacktracking(i+1, n);
        System.out.print(i+" ");

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=sc.nextInt();
        print(1,n);
        System.out.println();
        reverse(n);
        System.out.println();
        printbacktracking(n, n);
        System.out.println();
        reverseprintbacktracking(1, n);
    }
}
