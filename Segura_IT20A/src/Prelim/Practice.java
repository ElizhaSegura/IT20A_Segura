package Prelim;

import java.util.Stack;


public class Practice {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        
        stack.push(60);
        
        System.out.println("Updated Stack: " );
        for(int i=0; i<stack.size(); i++){
            System.out.println(stack.get(i));
        }
        
        System.out.println("Number of elements left: " + stack.size());
       
        
    }
   
    }
