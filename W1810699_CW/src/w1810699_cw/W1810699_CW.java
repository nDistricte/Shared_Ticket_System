/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w1810699_cw;
import java.util.Random;
/**
 *
 * @author Anatol Satler | W1810699 
 */
public class W1810699_CW {
    //that is the Purchase ticket System
    public static void main(String[] args) throws InterruptedException {

        //Creating 4 different Numbers between 3 and 1 for the amount of tickets
        Random random = new Random(); 
        int randomNumber1 = random.nextInt(3 - 1 + 1) + 1;
        int randomNumber2 = random.nextInt(3 - 1 + 1) + 1;
        int randomNumber3 = random.nextInt(3 - 1 + 1) + 1;
        int randomNumber4 = random.nextInt(3 - 1 + 1) + 1;
 
        //Creating new Objects
        TicketMachine Machine = new TicketMachine();                
        Passenger pas1 = new Passenger(randomNumber1,Machine);
        Passenger pas2 = new Passenger(randomNumber2,Machine);
        Passenger pas3 = new Passenger(randomNumber3,Machine);
        Passenger pas4 = new Passenger(randomNumber4,Machine);
        TicketTechnician ticketT = new TicketTechnician(Machine);
        TonerTechnician tonerT = new TonerTechnician(Machine);
        
        //Creating 6 Threads
        // 4 Passangers, 1 Paper Technician and 1 Toner Technician
        Thread passanger1_Thread = new Thread(pas1, "Passenger1");
        Thread passanger2_Thread = new Thread(pas2, "Passenger2");
        Thread passanger3_Thread = new Thread(pas3, "Passenger3");
        Thread passanger4_Thread = new Thread(pas4, "Passenger4");
        Thread PaperTechnician_Thread = new Thread(ticketT, "Ticket Technician");
        Thread TonerTechnician_Thread = new Thread(tonerT, "Toner Technician");
        
        //Initialising the 6 Threads
        passanger1_Thread.start();   
        passanger2_Thread.start();    
        passanger3_Thread.start();
        passanger4_Thread.start();
        PaperTechnician_Thread.start();
        TonerTechnician_Thread.start();
        
     
    }
    
}
