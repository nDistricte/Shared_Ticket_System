/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1810699_cw;

/**
 *
 * @author ASatl
 */
public class Passenger extends Users {
    
    final int amount;
    
    //Constructor takes TicketMachine to access Methods, Amount of Tickets wanted
    public Passenger(int amount ,TicketMachine Machine){
    this.Machine = Machine;
    this.amount = amount;
    }
    
    //Executes the purchase method
    public void run(){
        try {
            
            System.out.println(Thread.currentThread().getName() +" wants to purchase " + amount + "  tickets");
            Passenger(amount, Machine);
            
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
    }
}
