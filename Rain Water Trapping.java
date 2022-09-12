import java.util.*;
public class Main {

	

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] height = new int[n];
			for(int i  = 0  ;  i < n ; i++){
				height[i] = sc.nextInt();
			}
		
			int[] left = new int[n];
			left[0] = height[0];
			for(int i=1;i<n;i++)
				left[i] = Math.max(left[i-1],height[i]);
			int[] right = new int[n];
			right[n-1] = height[n-1];
			for(int i = n-2; i>=0;i--)
				right[i] = Math.max(right[i+1],height[i]);
			int sum = 0;
			for(int i = 0;i<n;i++)
				sum += (Math.min(left[i],right[i]) - height[i]);
			System.out.println(sum);
			t--;
		}
    }
}

// https://hack.codingblocks.com/app/contests/3504/327/problem
