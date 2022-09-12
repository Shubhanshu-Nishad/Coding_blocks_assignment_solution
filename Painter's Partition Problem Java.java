import java.util.*;
public class Main {
	public static boolean isitpossible(int[] board, int nop, int mid) {
		// TODO Auto-generated method stub
		int painter=1;
		int board_paint=0;
		int i=0;
		while(i<board.length) {
			if(board_paint+board[i]<=mid) {
				board_paint+=board[i];
				i++;
			}
			else {
				painter++;
				board_paint=0;
				
			}
			if(painter>nop) {
				return false;
			}
		}
		
		
		
		
		return true;
	}
	public  static int  AGGRCOW_Answer(int[] board, int nop) {
		int lo=0;
		int hi=0;
		int ans=0;
		for(int val :board) {
			hi+=val;
		}
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isitpossible(board,nop,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

    public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
	
			int nop = sc.nextInt();
			int nob = sc.nextInt();
			
			int[] board = new int[nob];
			for (int i = 0; i < board.length; i++) {
				board[i] = sc.nextInt();
			}
			
			System.out.println(AGGRCOW_Answer(board, nop));
    }
}
// https://hack.codingblocks.com/app/contests/3504/1057/problem
