import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int m=0;m<t;m++){
			long n = sc.nextLong();
			int k = sc.nextInt();
			long left = 1;
			long right = n ;
			long mid = 0;
			long answer=0;
			while(left <= right){
				mid = left + (right - left )/2;
				if(Math.pow(mid,k) <= n){
					left=mid+1;
					answer=mid;
					
				} 
				 else{
					right=mid-1;
				}
			}
			System.out.println(answer);
		}
    }
}
// https://hack.codingblocks.com/app/contests/3504/43/problem
