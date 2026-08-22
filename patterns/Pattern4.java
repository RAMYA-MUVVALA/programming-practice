import java.util.Scanner;
class Pattern4 {
    public static void main(String arge[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of testcases");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter n value: ");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
        }

    }
}