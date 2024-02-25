/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1810699_cw;

import static java.lang.Thread.sleep;
import java.util.Random;

/**
 *
 * @author ASatl
 */
//Takes methods from the machine class to implemt it 
public class Users implements Runnable {
    
    TicketMachine Machine = new TicketMachine();
    Random random = new Random();
    
    //Passengers only task is it to make a purchase 
    public void Passenger (int amount, TicketMachine Machine) throws InterruptedException {        
        this.Machine = Machine;
        Machine.purchase(amount);       
    }
    
    //Toner Technicians only task is it to refill the machine with Toner
    public void TonerTechnician(TicketMachine Machine) throws InterruptedException {
        this.Machine = Machine;
        Machine.refillToner();
        
    }
    //Paper Technicians only task is it to refill the machine with Paper
    public void PaperTechnician(TicketMachine Machine) throws InterruptedException {
        this.Machine = Machine;
        Machine.refillPaper();   
    }
    
    //Leaving it empty because the class is being used to inherit the methods
    @Override
    public void run() {
        
    }
    
}
