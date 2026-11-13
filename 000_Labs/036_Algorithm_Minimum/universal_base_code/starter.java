/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int y=(int)(Math.random()*150+51);
		int []arr=new int[y];
		int min=Integer.MAX_VALUE;
		int number=(int)(Math.random()*100+1);
		for(int i=0;i<y;i++){
			arr[i]=number;
			if(arr[i]<min){
				min=arr[i];
			}
		}
		int max=0;
		for(int q=0;q>0;q++){
			arr[q]=number;
			if(arr[q]>max){
				max=arr[q];
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}
}
