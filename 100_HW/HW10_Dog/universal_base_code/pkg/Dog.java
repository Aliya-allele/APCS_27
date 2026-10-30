package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog{
	String name;
	int age;
	String breed;
		
	public Dog(){
		name="Clifford";
		age=3;
		breed="big red dog";
		}
		public Dog(String idk){
		name=idk;
		age=1;
		breed="dog dog";
		}
		public Dog(String idk,int years){
			name=idk;
			age=years;
			breed="dog dog";
		}
		public void setName(String newName){
			name=newName;
			return;
		}
		public void setAge(int newAge){
			age=newAge;
			return;
		}
		public void setBreed(String newBreed){
			breed=newBreed;
			return;
		}
		public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getBreed(){
			return breed;
		}
		public boolean isSleeping(){
			int a=(int)(Math.random()*10+1);
			if(a%2!=0){
				System.out.println(name+" is sleeping.");
			   return true;
			}else{
				System.out.println(name+" is awake!");
			   return false;
			}
		}
		public void bark(){
			if(isSleeping()){
				System.out.println("Nighty Night");
				System.out.println("Juno is also asleep.");
			}else{
			System.out.println(name+" barks!");
			System.out.println("Juno wakes up from "+name+"s bark!");
			System.out.println("Juno barks as well.");
			}
		}
	public void dogToString(){
		System.out.println(name+" is a "+breed+" that is "+age+" years old.");
	}
	
}
