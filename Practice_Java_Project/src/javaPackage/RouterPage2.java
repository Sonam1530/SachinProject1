package javaPackage;

import java.util.*;

public class RouterPage2 {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> List = new ArrayList<>();
		
		List.add(20);
		List.add(30);
		List.add(20);
		List.add(45);
		List.add(35);
		
		System.out.println(List);
		List.remove(2);
		System.out.println(List);
		
		/*ArrayList<Integer> newList = new ArrayList<>();
		newList.add(100);
		newList.add(200);
		
		List.addAll(newList);
		System.out.println(List);
		System.out.println(List.get(4)); 
		*/
		
		Stack<String> listadd = new Stack<>();
		listadd.push("Sachin");
		System.out.println(listadd);
		
		
}
}