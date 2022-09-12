import java.util.*;
public class Main {

	public static int[] reverse_without_recusion(int[] arr, int n){
		int[] arr1 = new int[n];
		for(int i=0 ;i<n;i++){
			arr1[arr[i]] = i;
		}
		return arr1;
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ;i<n;i++){
			arr[i] = sc.nextInt();
		}
		arr = reverse_without_recusion(arr,n);
		for(int i=0 ;i<n;i++){
			System.out.print(arr[i] +" ");
		}
    }
}

// https://hack.codingblocks.com/app/contests/3504/21/problem
