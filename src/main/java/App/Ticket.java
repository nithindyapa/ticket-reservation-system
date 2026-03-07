/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author nithi
 */
public class Ticket {
    public String TicketNo;
    public String StartingLocation;
    public String DestinationLocation;
    public String PassengerNo;

    public void PaymentAmount() {
        System.out.println("Calculating payment amount for the ticket.");
    }

    public void CancelTicket() {
        System.out.println("Ticket status updated to cancelled.");
    }
}
