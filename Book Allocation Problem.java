// correct solution

import java.util.*;
public class Main {
	public static int minPage(int[] page, int S) {
		int high = 0;
		for (int i = 0; i < page.length; i++) {
			high += page[i];
		}
		int low = 0;
		int res = 0;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (isPossible(page, mid, S) == true) {
				res = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return res;
	}

	private static boolean isPossible(int[] page, int mid, int stud) {
		
		int S = 1;
		int read = 0;
		int i = 0;
		while (i < page.length) {
			if (read + page[i] <= mid) {
				read += page[i];
				i++;
			} else {
				read = 0;
				S++;

			}
			if (S > stud) {
				return false;
			}
		}

		return true;

	}
	
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			int book=sc.nextInt();
			int stud=sc.nextInt();
			int dp[]=new int[book];
			for(int i=0;i<book;i++){
				dp[i]=sc.nextInt();
			}
			System.out.println(minPage(dp, stud));
			
		}
		
    }

}





// wrong solution 
import java.util.*;
public class Main {
	public static boolean isPossible(int[] arr,int bn,int sn,int mid){
		int studentCount = 1;
		int pageOfsum = 0;
		for(int i =0 ; i< bn; i++){
			if(pageOfsum + arr[i] <= mid){
				pageOfsum += arr[i];
			}else{
				studentCount++;
				if( studentCount > sn || arr[i]>mid)
					return false;
				pageOfsum++;
			}
		}
		return true;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int bn = sc.nextInt();
			int sn = sc.nextInt();
			int[] arr = new int[bn]; 
			for(int i=0;i<bn;i++){
				arr[i] = sc.nextInt();
			}
			int ans = -1;
			int right =0 ;
			for(int i=0;i<bn;i++)
				right +=arr[i];
			int left=0;
			while(left<=right){
				int mid = left + (right -left )/2;
				if(isPossible(arr,bn,sn,mid)){
					ans = mid;
					right = mid-1;
				}else left = mid+1;
			}
			System.out.println(ans);
			t--;
		}
    }
}

// https://hack.codingblocks.com/app/contests/3504/1365/problem
