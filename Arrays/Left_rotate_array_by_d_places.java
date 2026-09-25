import java.util.Scanner;

class Left_rotate_array_by_d_places {
     public static void rotateArray(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        // 1. Reverse first k elements
        reverse(nums, 0, k - 1);

        // 2. Reverse remaining elements
        reverse(nums, k, n - 1);

        // 3. Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr size of an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter no ok left rotations");
        int k=sc.nextInt();
        rotateArray(a,k);
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
