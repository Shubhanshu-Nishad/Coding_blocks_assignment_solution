import java.util.*;
public class Main {
	public static boolean isPossible(int[] stall,int mid,int noc ){
		int cow = 1;
		int pos = stall[0];
		int i =1;
		while(i<stall.length){
			if(stall[i]-pos >= mid){
				cow++;
				pos = stall[i];
			}
			if(cow == noc) return true;
			i++;
		}
		return false;
	}
	public static int LargestDistance(int[] stall, int noc){
		int left = 0;
		int right = stall[stall.length-1] - stall[0];
		int ans =0;
		while(left<=right){
			int mid = left + (right - left)/2;
			if(isPossible(stall,mid,noc)){
				ans = mid;
				left = mid+1;
			} 
			else right = mid -1;
			
		}
		return ans;
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int nos = sc.nextInt();
		int noc = sc.nextInt();
		int[] stall = new int[nos];
		for (int i = 0; i < nos; i++) {
			stall[i] = sc.nextInt();
		} 
		Arrays.sort(stall);
		System.out.println(LargestDistance(stall,noc));
    }
}


// https://hack.codingblocks.com/app/contests/3504/1056/problem
// Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]
