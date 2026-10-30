/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman TM=new Spiderman("Tobey Maguire");
		Spiderman AG=new Spiderman("Andrew Garfield",40);
		Spiderman TH=new Spiderman(27);
		Spiderman JZ=new Spiderman("Jaden Zheng",120,"Susannah");
		TM.setAge(48);
		TM.setVillain("Green Goblin");
		AG.setVillain("Electro");
		TM.SpidermanToString();
		System.out.println();
		AG.SpidermanToString();
		System.out.println();
		TH.setActor("Tom Holland");
		TH.setVillain("The Vulture");
		TH.SpidermanToString();
		System.out.println();
		JZ.SpidermanToString();
	}
}
