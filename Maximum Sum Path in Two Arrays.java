import java.util.*;
public class Main {
	public static int MAxPAthSUM(int[] arr1, int[] arr2) {

		int s1 = 0;// arr1
		int s2 = 0;// arr2

		int i = 0;
		int j = 0;
		int ans = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr1[i] > arr2[j]) {
				j++;
			} else {
				int sum1 = 0;
				for (int k = s1; k <= i; k++) {
					sum1 += arr1[k];
				}

				int sum2 = 0;
				for (int k = s2; k <= j; k++) {
					sum2 += arr2[k];
				}
				ans = ans + Math.max(sum1, sum2);
				i++;
				j++;
				s1 = i;
				s2 = j;
			}

		}
		int sum1 = 0;
		for (int k = s1; k < arr1.length; k++) {
			sum1 += arr1[k];

		}
		int sum2 = 0;
		for (int k = s2; k < arr2.length; k++) {
			sum2 += arr2[k];

		}
		ans = ans + Math.max(sum1, sum2);
		return ans;

	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
         while(t-- >0) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int[] arr2 = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(MAxPAthSUM(arr1, arr2));
         }
    }
}
// https://hack.codingblocks.com/app/contests/3504/552/problem
