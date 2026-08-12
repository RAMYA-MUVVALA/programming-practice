import java.util.Scanner;
class Pattern5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            for(int i=n;i>0;i--)
            {
                for(int j=0;j<i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}