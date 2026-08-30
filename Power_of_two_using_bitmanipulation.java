import java.util.Scanner;
class Power_of_two_using_bitmanipulation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value:");
        int n=sc.nextInt();
        boolean ans=(n&(n-1)) == 0;
        System.out.println(ans);
    }
}
