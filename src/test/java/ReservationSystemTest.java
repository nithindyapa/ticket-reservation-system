/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import App.Passenger;
import App.Payment;
import App.RailwayDatabase;
import App.Ticket;
import App.Train;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nithi
 */
public class ReservationSystemTest {
    
    @Test
    public void testPassengerDetails() {
        Passenger p = new Passenger();
        p.Name = "Alice";
        p.Age = 30;
        assertEquals("Alice", p.Name);
        assertEquals(30, p.Age);
    }

    @Test
    public void testTrainDetails() {
        Train t = new Train();
        t.TrainId = "TR123";
        t.Model = "Express";
        assertEquals("TR123", t.TrainId);
        assertEquals("Express", t.Model);
    }

    @Test
    public void testPaymentAmount() {
        Payment pay = new Payment();
        pay.Amount = 1500.50;
        assertEquals(1500.50, pay.Amount, 0.01);
    }

    @Test
    public void testTicketAssignment() {
        Ticket tkt = new Ticket();
        tkt.TicketNo = "TKT999";
        tkt.StartingLocation = "Chennai";
        tkt.DestinationLocation = "Vellore";
        assertEquals("Chennai", tkt.StartingLocation);
        assertEquals("Vellore", tkt.DestinationLocation);
    }

    @Test
    public void testRailwayDatabaseResponse() {
        RailwayDatabase db = new RailwayDatabase();
        db.ID = "DB001";
        db.Response = "Success";
        assertEquals("Success", db.Response);
    }
}
