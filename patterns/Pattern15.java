import java.util.Scanner;
class Pattern15 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            for(int i=n-1;i>=0;i--)
            {
               int ch=65;
               for(int j=0;j<=i;j++)
               {
                System.out.print((char)(ch)+" ");
                ch++;
               }
               System.out.println();

            }
        }
    }
    
}