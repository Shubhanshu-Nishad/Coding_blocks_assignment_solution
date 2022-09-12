import java.util.*;
public class Main {
	public static void PiarofRoses(int[] arr,int amount){
		int diff = Integer.MAX_VALUE;
		int a = 0;
		int b = 0;
		for(int i = 0 ; i< arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == amount && diff > Math.abs(arr[i]-arr[j])){
					diff = Math.abs(arr[i]-arr[j]);
					a = arr[i];
					b = arr[j];
				}
			}
		}
	System.out.println("Deepak should buy roses whose prices are "+Math.min(a,b)+" and "+Math.max(a,b)+".");
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			
			int[] price = new int[n];
			for (int i = 0; i < price.length; i++) {

				price[i] = sc.nextInt();

			}

			int amount = sc.nextInt();
			PiarofRoses(price,amount);

		}	
		
	}

}

// https://hack.codingblocks.com/app/contests/3504/1003/problem
