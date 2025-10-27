
package Prelim;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        
//          LinkedList Declaration  
    LinkedList<String> playlist = new LinkedList <>();

//          Add element 
    playlist.add("Song k");
    playlist.add("Song B");
    playlist.add("Song C");
    
//         Insert at first
 //   playlist.addFirst("Intro song");

//          Insert at end
    playlist.addLast("Ending song");
    
//          Remove
  //  playlist.remove("Song A");
    playlist.removeLast();
    
    
//         Access Song
   System.out.println(playlist.getFirst());
//          print list
    System.out.println(playlist);
    }
}
