import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n]; 
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			for(int i = 0;i < n; i++ ){
				if(arr[i]==target) {
					System.out.println(i);
					return;
				}
			}
			System.out.println("-1");
    }
}

// https://hack.codingblocks.com/app/contests/3504/398/problem
