/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int idk = (int)(Math.random()*7);
		PooleDwarf eins=new PooleDwarf(randName(),idk);
		PooleDwarf zwei=new PooleDwarf(randName(),idk);
		PooleDwarf drei=new PooleDwarf(randName(),idk);
		PooleDwarf vier=new PooleDwarf(randName(),idk);
		PooleDwarf fuenf=new PooleDwarf(randName(),idk);
		PooleDwarf sechs=new PooleDwarf(randName(),idk);
		PooleDwarf sieben=new PooleDwarf(randName(),idk);
		int a=0;
		if(eins.isSameName(zwei.getName())){
			a++;
		}
		if(eins.isSameName(drei.getName())){
			a++;
		}
		if(eins.isSameName(vier.getName())){
			a++;
		}
		if(eins.isSameName(fuenf.getName())){
			a++;
		}
		if(eins.isSameName(sechs.getName())){
			a++;
		}
		if(eins.isSameName(sieben.getName())){
			a++;
		}
		System.out.println(eins.getName()+" was the name with "+a+" matches!");
		
		
	}
}
