import java.util.Scanner;
class Pattern18 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of testcases:");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter n value");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int ch=69;
                for(int j=0;j<=i;j++)
                {
                    System.out.print((char)(ch));
                    ch--;
                }
                System.out.println();
            }
        }
    }
}
