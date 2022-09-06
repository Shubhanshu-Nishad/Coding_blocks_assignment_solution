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
		Arrays.sort(arr);
		for(int i = 0;i < n; i++ ){
            for(int j = i+1;j < n; j++ ){
				for(int k = 1+j;k < n; k++ ){
					if(arr[k]==(target-arr[i]-arr[j])){
						if(arr[i]>arr[j]){
							if(arr[j]>arr[k]) System.out.println(arr[k]+", "+arr[j]+" and "+arr[i]);
							else System.out.println(arr[j]+", "+arr[k]+" and "+arr[i]);
						} else{
							if(arr[i]>arr[k]) System.out.println(arr[k]+", "+arr[i]+" and "+arr[j]);
							else System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
						}
					}
				}
            }
        }
    }
}

// https://hack.codingblocks.com/app/contests/3504/195/problem
