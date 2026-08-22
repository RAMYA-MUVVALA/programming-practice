import java.util.Scanner;
class Print_n_times_name {
    public static void name(int i ,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Ramya");
        name(i+1,n);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        name(1,n);


    }
}
