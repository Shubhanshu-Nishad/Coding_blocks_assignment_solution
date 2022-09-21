import java.util.*;
public class Main {
	
    public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = 0;i<str.length()-1;i++){
			if( (int) str.charAt(i+1) >64 &&  (int) str.charAt(i+1)<91)
				System.out.println(str.charAt(i));
			else
				System.out.print(str.charAt(i));
				
		}
		System.out.print(str.charAt(str.length()-1));
    }
}


//https://hack.codingblocks.com/app/contests/3539/66/problem
