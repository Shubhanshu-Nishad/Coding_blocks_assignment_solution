import java.util.*;
public class Main {
	public static boolean Alex_Goes_Shopping(int[] price,int amount , int k){
		int count=0;
		for (int i = 0; i < price.length; i++) {
			if(amount%price[i]==0) {
				count++;
			}
		}
		if(count>=k) {
			return true;
		}
		else {
			return false;
		}
	}
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			
		int[] price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		while(t-->0){
			int amount = sc.nextInt();
			int k = sc.nextInt();
			if(Alex_Goes_Shopping(price, amount, k)==true) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}

// https://hack.codingblocks.com/app/contests/3504/1094/problem
