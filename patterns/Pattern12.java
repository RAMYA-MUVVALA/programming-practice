import java.util.Scanner;
class Pattern12 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of test cases: ");
        int t=sc.nextInt();
        while(t-->0)
        {
            System.out.println("Enter n value: ");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                //number
                for(int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }


                //space
                for(int j=1;j<=(2*n-2*i);j++)
                {
                    System.out.print(" ");
                }


                //number
                for(int j=i;j>=1;j--)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
    
}
