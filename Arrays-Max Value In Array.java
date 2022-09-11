import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		for(int i=0 ;i<n;i++){
			if(arr[i]>max) max = arr[i];
		}
		System.out.println(max);
    }
}

// https://hack.codingblocks.com/app/contests/3504/477/problem
