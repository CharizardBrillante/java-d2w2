import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ListMaker {
	
	public static ArrayList<String> createList(int len, Scanner scan){
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Digita le parole da inserire nella lista.");
		for(int i=0; i<len; i++) {
			System.out.println("Parola " + i + ":");
			list.add(scan.nextLine());
		}
		
		return list;
	}
	
	public static ArrayList<Cloneable> setList(ArrayList<String> list) {
		
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> duplicates = new ArrayList<String>();
		
		for(int i=0; i<list.size(); i++) {
			if(set.add(list.get(i))) {
				set.add(list.get(i));
			}else {
				duplicates.add(list.get(i));
			}
		}
		
		ArrayList<Cloneable> res = new ArrayList<Cloneable>();
		res.add(set);
		res.add(duplicates);
		
		return res;
	}
	
	public static ArrayList<Integer> createRandomList(int len){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<len; i++) {
			list.add(ThreadLocalRandom.current().nextInt(1, 101));
		}
		
		return list;
	}
	
	public static ArrayList<Integer> createMirrorList(ArrayList<Integer> list){
		@SuppressWarnings("unchecked")
		ArrayList<Integer> listClone = (ArrayList<Integer>)list.clone();
		Collections.reverse(list);

		listClone.addAll(list);

		return listClone;
	}
	
	public static ArrayList<Integer> getEven(ArrayList<Integer> list, boolean b){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			if(b) {
				if(i%2==0) newList.add(list.get(i));
					
			}else {
				if(i%2!=0) newList.add(list.get(i));
			}
				
		}
		
		return newList;
	}
	
}
	
	
	

