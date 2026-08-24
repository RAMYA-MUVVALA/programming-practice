import java.util.Scanner;
class Factorial_of_n {
    public static void parafact(int i,int fact)
    {
        if(i<1)
        {
            System.out.println("Factorial of n is :"+fact);
            return;
        }
        parafact(i-1, fact*i);
        
    }
    public static int funcfact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*funcfact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        parafact(n, 1);
        System.out.println("Function factorial is: "+funcfact(n));
    }
}
