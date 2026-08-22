import java.util.Scanner;
class Pattern3 {
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
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }
}
