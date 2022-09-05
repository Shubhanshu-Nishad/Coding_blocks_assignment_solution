import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n]; 
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int operation = sc.nextInt();
		for(int i = 0;i<operation;i++){
			int k = sc.nextInt();
			int[] arr1 = new int[n];
			for(int l=0;l<n;l++){
				int sum = arr[l] + arr[(n-(n+k+l)%n)-1];
				arr1[l] =sum;
			}
			arr = arr1;
		}
		int total = 0;
		for(int l=0;l<n;l++){
			total +=arr[l];
				
		}
		int res = (int) ((total)%(Math.pow(10,9)+7));
		System.out.println(res);
    }
}

// https://hack.codingblocks.com/app/contests/3504/61/problem
