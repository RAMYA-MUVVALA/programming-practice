import java.util.Scanner;
class Count_no_of_occurreneces_if_element {
    public static int count(int[] arr,int n)
    {
        int cou=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                cou=cou+1;
            }

        }
        return cou;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int si=sc.nextInt();
        int[] a=new int[si];
        for(int i=0;i<si;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter search number");
        int n=sc.nextInt();
        System.out.println("Answer is :"+count(a,n));

    }
}
