/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author nithi
 */
public class Main {
    public static void main(String[] args) {
        Passenger p1 = new Passenger();
        p1.Name = "John Doe";
        p1.SearchTrains();
        p1.ReserveSeat();
        p1.MakePayment();

        TicketClerk clerk = new TicketClerk();
        clerk.Name = "Jane Smith";
        clerk.ReseivePayment();
        clerk.ReserveTicket();
    }
}