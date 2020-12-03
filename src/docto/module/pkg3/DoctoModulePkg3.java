/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg3;
import java.lang.*;
/**
 *
 * @author User-pc
 */
public class DoctoModulePkg3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     class Mytask extends Thread {
        
         @Override
    public void run() {
        for (int doc=1;doc<=10;doc++) {
             System.out.println("Printing Documents "+doc+" Please wait....");
             System.out.println("Printed doc "+doc+"- Printer2");
        
    }
        
    }
     }
     System.out.println("Application Started");
     
     
     for (int doc=1; doc<=10;doc ++){
         System.out.println("doc printed" +doc+ " - Printed1");
     }
     
     
     Mytask task = new Mytask();
     task.start();// start thread
     
     System.out.println("Application Finished");
    }
    
}
