import java.util.Scanner;
class Sum_of_first_n_numbers {
    public static void parametersum(int i,int sum)
    {
        if(i<1)
        {
            System.out.println("Sum of n numbers is: "+sum);
            return;
        }
        parametersum(i-1, sum+i);
    }
    public static int functionsum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+functionsum(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        int sum=0;
        parametersum(n, 0);
        sum=functionsum(n);
        System.out.println("Functionsum is: "+sum);
    }
    
}
