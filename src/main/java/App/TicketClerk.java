/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author nithi
 */
public class TicketClerk {
        public String Name;
    public String Location;

    public void ReserveSeat() {
        System.out.println("Clerk: Reserving seat for passenger.");
    }

    public void ReserveTicket() {
        System.out.println("Clerk: Ticket reserved.");
    }

    public void CancelTicket() {
        System.out.println("Clerk: Ticket cancelled.");
    }

    public void ReseivePayment() {
        System.out.println("Clerk: Payment received.");
    }
}
