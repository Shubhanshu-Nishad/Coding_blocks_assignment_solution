// Corrrect solution
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			long sum = 0;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int[] frq = new int[n];
			frq[0] =1;
			for(int i =0;i<frq.length ;i++){
				sum = sum + arr[i];
				int idx = (int)(sum%n);
				if(idx < 0){
					idx +=n;
				}
				frq[idx] = frq[idx] +1;
			}
			long ans=0;
			for(int i=0 ; i<frq.length;i++){
				if(frq[i]>=2){
					long p = frq[i];
					ans +=(p *(p-1))/2;
				}
			}
			System.out.println(ans);

			// for(int i=0 ; i<n;i++){
			// 	sum =0;
			// 	for(int j =i;j<n;j++){
			// 		sum +=arr[j];
			// 		if(sum%n==0){
			// 		count++;
			// 	}
			// 	}
			// }
		}
    }
}




// Wrong Solution -> incomplete solution

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			int sum = 0;
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				sum +=arr[i];
			}
			int count =0;
			for(int i=0 ; i<n;i++){
				sum =0;
				for(int j =i;j<n;j++){
					sum +=arr[j];
					if(sum%n==0){
					count++;
				}
				}
			}
			System.out.println(count);
		}
    }
}
// https://hack.codingblocks.com/app/contests/3504/1065/problem
