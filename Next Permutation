import java.util.*;
public class Main {

	public static void swap (int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void reverse(int arr[],int i,int j){
        while(i<j) swap(arr,i++,j--);
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i  = 0  ;  i < n ; i++){
				arr[i] = sc.nextInt();
			}
			
			int i=arr.length-2;
        	while(i>=0 && arr[i]>=arr[i+1]) i--;
        	int j = arr.length-1;
        	if(i>=0){
            while(j>0 && arr[i]>=arr[j]) j--; 
            swap(arr,i,j);
        	}      
        	reverse(arr,i+1,arr.length-1);

			for(int k = 0  ;  k < n ; k++){
				System.out.print(arr[k]+" ");
			}
			System.out.println();
			t--;
		}
    }
}

// https://hack.codingblocks.com/app/contests/3504/1075/problem
