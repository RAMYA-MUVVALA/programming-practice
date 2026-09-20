import java.util.*;
class Merge_sort {
    public static void mergesort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int mid=(low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high)
    {
        int[] temp=new int[high+1];
        int left=low;
        int right=mid+1;
        int i=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[i]=arr[left];
                i++;
                left++;
            }
            else
            {
                temp[i]=arr[right];
                i++;
                right++;
            }
        }
        while(left<=mid)
        {
            temp[i]=arr[left];
            i++;
            left++;
        }
        while(right<=high)
        {
            temp[i]=arr[right];
            i++;
            right++;
        }
        for(int k=low;k<=high;k++)
        {
            arr[k]=temp[k-low];
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        int n=sc.nextInt();
        System.out.println("Enter array elemnts");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        mergesort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
