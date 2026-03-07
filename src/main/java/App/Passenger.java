/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author nithi
 */
public class Passenger {
        public String Name;
    public int Age;
    public String Address;

    public void SearchTrains() {
        System.out.println("Searching for available trains...");
    }

    public void ViewSchedule() {
        System.out.println("Viewing train schedules...");
    }

    public void ReserveSeat() {
        System.out.println("Seat reserved successfully.");
    }

    public void PurchaseTicket() {
        System.out.println("Ticket purchased.");
    }

    public void CancelTicket() {
        System.out.println("Ticket cancelled by passenger.");
    }

    public void MakePayment() {
        System.out.println("Payment processed by passenger.");
    }
}
