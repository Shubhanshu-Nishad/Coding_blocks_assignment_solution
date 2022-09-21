import java.util.*;
public class Main {
    public static long[] productExceptSelf(long[] arr) {
        long [] left = new long[arr.length];
        int n = arr.length;
        left[0] = 1;
        for(int i=1;i<n;i++)
            left[i] = left[i-1]*arr[i-1];
        long[] right = new long[arr.length];   
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--)
            right[i] = right[i+1]*arr[i+1];
        for(int i =0 ; i<right.length;i++)
            left[i] = left[i] * right[i];
        return left;
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long nums[]=new long[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextLong();
		}
        nums = productExceptSelf(nums);
        for(int i=0;i<n;i++){
			System.out.print(nums[i]+" ");
		}
    }
}
// https://hack.codingblocks.com/app/contests/3504/1493/problem
