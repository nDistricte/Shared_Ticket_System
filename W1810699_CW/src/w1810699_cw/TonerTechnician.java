/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1810699_cw;

/**
 *
 * @author ASatl
 */
public class TonerTechnician extends Users {
    
    //Constructor takes TicketMachine to access Methods
    public TonerTechnician(TicketMachine Machine){
    this.Machine = Machine;
    }
   
    //Executes the refillPaper method
    public void run(){
        
    try {     
        
        TonerTechnician(Machine);
        System.out.println(Thread.currentThread().getName() + " refilled Toner. Total Toner: " + Machine.availableToner);
        } catch (InterruptedException e) {
        e.printStackTrace();
        } 
    }
}
