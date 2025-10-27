
package Midterms;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalManagementSystem {
    public static void main (String[] args){
        Queue<String> arrivalQueue = new LinkedList<>();
        
        PriorityQueue<Integer> patientSeverity = new PriorityQueue<>();
        
        //A severity level (1 = Critical, 2 = Serious, 3 = Minor)
        
           arrivalQueue.add("Anna (Severity: 3)");
        arrivalQueue.add("Bob (Severity: 1)");
        arrivalQueue.add("Carla (Severity: 2)");
        arrivalQueue.add("Dave (Severity: 1)");
        
          patientSeverity.add(3);
        patientSeverity.add(1);
        patientSeverity.add(2);
        patientSeverity.add(1);
        
        System.out.println("=== Arrival Order ===");
            
        System.out.println("Arrival Order: " +arrivalQueue);
        System.out.println();
        
        System.out.println("=== Treatment Order ===");
        while(!patientSeverity.isEmpty()){
            int currentSeverity = patientSeverity.poll();
            
            for(String patient : arrivalQueue){
                if(patient.contains("(Severity: "+ currentSeverity + "")){
                    System.out.println("Treating: " + patient);
                    arrivalQueue.remove(patient);
                    break;
                }
            }
        }
        
    }
}
