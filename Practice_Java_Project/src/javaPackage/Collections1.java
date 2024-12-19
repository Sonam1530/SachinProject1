package javaPackage;

import java.util.*;

public class Collections1 {
	
	static void CollectionUsage() {
		//initilizing array of Integers
		int[] numberArray =new int[] {1,3,4,5};
		
		//crating ArrayList hold the Integers objects
		ArrayList<Integer> numberArrayList =new ArrayList<>();
		
		//creating HasMap to map Integer Keys to String Value
		Map<Integer,String> numberHashMap = new HashMap<>();
		
		//Add elements to ArrayList
		numberArrayList.add(2);
		numberArrayList.add(3);
		
		//Add elemets to hashMap with the help of put method
		numberHashMap.put(1,"Sonam");
		numberHashMap.put(2,"Sachin");
		
		 //Print the first element of the array.  
       System.out.println("First element of numbersArray: " + numberArray[0]);  
        // Print the first element of the ArrayList.  
      System.out.println("First element of numbersList: " + numberArrayList.get(0));  
        // Print the value associated with key 1 in the HashMap.  
       System.out.println("Value for key 1 in numbersMap: " + numberHashMap.get(1));  
        // Header for iterating over the array.  
        System.out.println("\nIterating over numbersArray:");  
        
        // Iterate through the array and print each element.
        for(Integer num: numberArrayList) {
       	System.out.println("Elemts: " + num);
        }
        // Header for iterating over the HashMap.  
       System.out.println("\nIterating over numbersMap:");  
        // Iterate through the HashMap and print each key-value pair.  
        for (Map.Entry<Integer, String> entry : numberHashMap.entrySet()) {  
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());  
        }  
    }  
    // The main method to run the showcaseCollectionsUsage method.  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionUsage();
  
	}

}

