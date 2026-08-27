import java.util.Scanner;
class Fibonacci_using_recursion
{
    public static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println(ans);

    }
}