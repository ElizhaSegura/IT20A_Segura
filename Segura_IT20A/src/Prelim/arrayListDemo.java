
package Prelim;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListDemo {
     public static void main(String[] args) {

//        Declare 
        ArrayList<String> fruits = new ArrayList<>();

//        Add element
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("guava");
        fruits.add("coconut");
        fruits.add("santol");

             
        // sort
        Collections.sort(fruits);
        //sort reverse
        Collections.sort(fruits, Collections.reverseOrder());
         System.out.println(fruits);
//        Access the elements in specific index
//        System.out.println(fruits.get(1));

//        modify element
//        fruits.set(0, "Pineapple");
//  Access all elements      
 /*       System.out.println(fruits);

        System.out.println("Number of Elements: " + fruits.size());

// Remove elements
        fruits.remove("banana");

//        fruits.clear();
        boolean empty = fruits.isEmpty();

        System.out.println(" Is empty?: " + empty);

//Access element using Loop

System.out.println("\n Accessing Arraylist using Loop" + "\n");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + "\n");
        }

// contains
        boolean hasGuava = fruits.contains("Guava".toLowerCase());

        System.out.println(hasGuava);*/
 
 
    }

}
    

