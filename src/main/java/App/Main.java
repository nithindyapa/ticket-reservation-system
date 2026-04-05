/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

/**
 *
 * @author nithi
 */
import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = Integer.parseInt(System.getenv("PORT"));

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", (var exchange) -> {
            try (exchange) {
                String response = "Ticket Reservation System Running!";
                exchange.sendResponseHeaders(200, response.length());
                exchange.getResponseBody().write(response.getBytes());
            }
        });

        server.start();
        System.out.println("Server started on port " + port);
    }
}
