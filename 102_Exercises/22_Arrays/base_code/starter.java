/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int []arrone=new int[1001];
		int []arrtwo=new int[1001];
		int y=1000;
		int x=0;
		int num=0;
		int nummer=0;
		while(num<1001){
			arrone[x]+=3;
			System.out.print(arrone[x]+" ");
			num++;
		}
		while(nummer<1000){
			arrtwo[nummer]=arrtwo[nummer]+(y-1);
			y--;
			System.out.print(arrtwo[nummer]+" ");
			nummer++;
		}
	}
}
