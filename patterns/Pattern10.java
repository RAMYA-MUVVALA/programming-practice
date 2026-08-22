import java.util.Scanner;
class Pattern10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases:");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter n value:");
            int n=sc.nextInt();
            for(int i=1;i<=(2*n-1);i++)
            {
                int stars=i;
                if(i>n)
                {
                    stars=2*n-i;
                }
                for(int j=1;j<=stars;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
