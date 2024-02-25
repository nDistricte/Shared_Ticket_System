/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1810699_cw;
import java.util.Random;
import static java.lang.Thread.sleep;

/**
 *
 * @author ASatl
 */

//TicketMachine which provides the needed operations
public class TicketMachine {
    
    // Declaring essential constants and variables
    final int maxTickets = 3;
    final int maxToner = 6;
    int availableTickets = 3;
    int availableToner = 6;

    Random random = new Random();
    
    //All 3 Methods are mutual exclusive
    
    //Refills the Machine Paper
    public void refillPaper() throws InterruptedException {
        //The method runs on as long as the machine is working 
        while(true){
            synchronized(this){ 
                while (availableTickets > 2) {
                    System.out.println("\bWaiting for paper to be used.\n");
                    wait(); //Waits until paper is fully used
            
                }
            //Generating a random number between 1sec - 5sec to simulate the refill
            int refillTime = random.nextInt((5000 - 1000) + 1)+1000;  
            System.out.println("\n" + Thread.currentThread().getName() + " acquires the printer for refilling");
            Thread.sleep(refillTime);
        
            System.out.println(Thread.currentThread().getName() + " refilled the machine paper to " + maxTickets);
            availableTickets = 3;
        
            //informs all threads to go into the Runnable state
            this.notifyAll();
            }
        }
    }
    
     //Refills the Machine Toner
    public void refillToner() throws InterruptedException {
        //The method runs on as long as the machine is working
        while(true){
            synchronized(this){
                while (availableToner > 2) {
                System.out.println("\bWaiting for toner to be used.\n");
                wait(); // Waits until toner is fully used

                }
            //Generating a random number between 1sec - 5sec to simulate the refill
            int refillTime = random.nextInt((5000 - 1000) + 1)+1000; 
            System.out.println("\n" + Thread.currentThread().getName() + " acquires the printer for refilling");
            Thread.sleep(refillTime);

            System.out.println(Thread.currentThread().getName() + " refilled the machine toner to " + maxToner);
            availableToner = 6;

            //informs all threads to go into the Runnable state
            this.notifyAll();
            }
        }
    }
     //Simulates a Purchase of a Customer
    public void purchase(int amount) throws InterruptedException {
        
        synchronized(this){
            while (availableTickets < amount || availableToner < amount) {
                System.out.println("\n" +Thread.currentThread().getName());
                System.out.println("------- Wanted amount of Ticket: " + amount);
                System.out.println("Available Ticket amount: " + availableTickets);
                System.out.println("Available Toner amount: " + availableToner);
                System.out.println("System needs to be refilled\n");
                this.wait();

            }

        availableTickets -= amount;
        availableToner -= amount;
        
        //Generating a random number between 1sec - 5sec to simulate a purchase
        int buyingTime = random.nextInt((5000 - 1000) + 1)+1000; 
        System.out.println("\n"+Thread.currentThread().getName() + " wants to purchase next.");
        Thread.sleep(buyingTime);
        
        System.out.println("\n SUCCESS");
        System.out.println("\\\\\\\\\\" + Thread.currentThread().getName() + "////////");
        System.out.println("---- Remaining Paper       : " + availableTickets);
        System.out.println("---- Remaining Toner       : " + availableToner + "\n");
        
        //informs all threads to go into the Runnable state
        this.notifyAll();
        }
    }
    
}
