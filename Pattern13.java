import java.util.Scanner;
class Pattern13 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of testcases:");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter n value");
            int n=sc.nextInt();
            int c=1;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
