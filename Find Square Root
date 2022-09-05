import java.util.*;
public class Main {
        public static int sqrt(int num){
        long left = 1;
        long right = num;
        long mid =0;
        while(left+1<right){
            mid = (right-left)/2 + left;
            if(mid*mid==num) return (int) mid;
            else if(mid*mid<num) left = mid;
            else right = mid;
        }
        if(right*right == num) return (int) right;
        else return (int) left;
        }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        int res = sqrt(n);
        System.out.println(res);
    }
}

// https://hack.codingblocks.com/app/contests/3504/1004/problem
