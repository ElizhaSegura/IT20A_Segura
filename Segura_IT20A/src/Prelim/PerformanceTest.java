
package Prelim;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class PerformanceTest {
    public static void main(String[] args){
        
        int n = 100000;
        
        // ArrayList
        ArrayList<Integer> arraylist = new ArrayList <>();
        
        long start = System.nanoTime();
        
        for(int i = 0; i < n; i++){
            arraylist.add(i);
                    }
            long end = System.nanoTime();
            System.out.print("ArrayList Performance Time: " + (end -start) + " ns ");
            
            // LinkedList
            LinkedList<Integer> linkedlist = new LinkedList <>();
        
        start = System.nanoTime();
        
        for(int i = 0; i < n; i++){
            linkedlist.add(i);
                    }
             end = System.nanoTime();
           System.out.print("\nLinkedList Performance Time: " + (end -start) + " ns ");
           
            // Stack
           Stack<Integer> stack = new Stack<>();
        
        start = System.nanoTime();
        
        for(int i = 0; i < n; i++){
            stack.add(i);
                    }
             end = System.nanoTime();
           System.out.print("\nStack Performance Time: " + (end -start) + " ns ");
            
       }
}
