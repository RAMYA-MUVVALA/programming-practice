import java.util.Scanner;
class Reverse_of_an_array {
    public static void reverse(int[] arr,int l,int r)
    {
        if(l>=r)
        {
            return;
        }

        //swap numbers
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;

        reverse(arr,l+1,r-1);
    }
    public static void reverse_using_1(int[] arr,int i,int n)
    {
        if(i>=n/2)
        {
            return;
        }
        //swap numbers
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;

        reverse_using_1(arr, i+1, n);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        reverse(a,0,n-1);
        for(int num:a)
        {
            System.out.print(num+" ");
        }
        reverse_using_1(a, 0, n);
        for(int num:a)
        {
            System.out.print(num);
        }
    }
}
