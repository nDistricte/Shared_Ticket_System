/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w1810699_cw;

/**
 *
 * @author ASatl
 */
public class TicketTechnician extends Users{
    
    //Constructor takes TicketMachine to access Methods
    public TicketTechnician(TicketMachine Machine) {
       this.Machine = Machine;
    }

    //Executes the refillPaper method
    public void run() {
        try {
            
            PaperTechnician(Machine);
            System.out.println(Thread.currentThread().getName() + " refilled tickets. Total tickets: " + Machine.availableTickets);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
