import java.util.*;
public class Main {
	public static void sortColors(int[] nums) {

    int zero =0;
    int one = 0;
    int two =0 ;
    
  for(int i =0; i<nums.length; i++){
     if(nums[i] ==0){
        zero++;
    }
    else if(nums[i]==1){
        one++;
    }
      else{
          two++;
      }
  }
    int index =0;
for(int i=1; i<=zero; i++){
    nums[index++] = 0;
}
    for(int i=1; i<=one; i++){
    nums[index++] = 1;
}
     for(int i=1; i<=two; i++){
    nums[index++] = 2;
}
    
    
}
    public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0 ;i<n;i++){
			arr[i] = sc.nextInt();
		}

		sortColors(arr);
		for(int i=0 ;i<n;i++){
			System.out.print(arr[i] +" ");
		}
    }
}

// https://hack.codingblocks.com/app/contests/3504/1330/problem
