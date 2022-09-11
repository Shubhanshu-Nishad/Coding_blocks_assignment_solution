import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n]; 
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			int target = sc.nextInt();
			int left = 0;
			int right = n ;
			int mid = 0;
			while(left <= right){
				mid = left + (right - left )/2;
				if(arr[mid] == target){
					System.out.println(mid);
					return;
				} 
				if(arr[mid]<target){
					left = mid + 1;
				}
				 else{
					right=mid-1;
				}
			}
			System.out.println("-1");
		}
}

// https://hack.codingblocks.com/app/contests/3504/199/problem
