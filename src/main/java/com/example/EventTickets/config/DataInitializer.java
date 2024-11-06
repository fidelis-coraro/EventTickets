/*package com.example.EventTickets.config;

import com.example.EventTickets.model.EventTicket;
import com.example.EventTickets.model.Seller;
import com.example.EventTickets.model.User;
import com.example.EventTickets.repository.EventTicketRepository;
import com.example.EventTickets.repository.SellerRepository;
import com.example.EventTickets.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*@Component
public class DataInitializer {
    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventTicketRepository eventTicketRepository;

    @PostConstruct
    public void loadData() {
        // Create Sellers in a specific order
        List<Seller> sellers = Arrays.asList(
                new Seller(), new Seller(), new Seller(), new Seller(), new Seller(),
                new Seller(), new Seller(), new Seller(), new Seller(), new Seller(),
                new Seller(), new Seller(), new Seller(), new Seller(), new Seller(),
                new Seller(), new Seller(), new Seller(), new Seller(), new Seller()
        );

        String[] sellerNames = {
                "John Doe", "Jane Smith", "Alice Brown", "Bob Johnson", "Charlie Black",
                "Emma White", "Michael Green", "Sarah Lee", "David Clark", "Karen Miller",
                "Rachel Adams", "Randy Miller", "Ralph Carter", "Raquel Diaz", "Ramesh Gupta",
                "Rajiv Patel", "Ray Williams", "Rasheed Ali", "Rania Khan", "Ranveer Singh"
        };
        for (int i = 0; i < sellers.size(); i++) {
            sellers.get(i).setName(sellerNames[i]);
        }

        sellers = sellerRepository.saveAll(sellers);

        // Create Users in a different specific order
        List<User> users = Arrays.asList(
                new User(), new User(), new User(), new User(), new User(),
                new User(), new User(), new User(), new User(), new User(),
                new User(), new User(), new User(), new User(), new User(),
                new User(), new User(), new User(), new User(), new User()
        );

        String[] userNames = {
                "User 1", "User 2", "User 3", "User 4", "User 5",
                "User 6", "User 7", "User 8", "User 9", "User 10",
                "User 11", "User 12", "User 13", "User 14", "User 15",
                "User 16", "User 17", "User 18", "User 19", "User 20"
        };

        for (int i = 0; i < users.size(); i++) {
            users.get(i).setName(userNames[i]);
        }

        users = userRepository.saveAll(users);

        List<EventTicket> eventTickets = new ArrayList<>();

        double[][] userSellerAmounts = {
                {400.0, 400.0, 400.0},
                {350.0, 350.0, 350.0},
                {300.0, 300.0, 350.0},
                {300.0, 300.0, 250.0},
                {260.0, 260.0, 260.0},
                {350.0, 350.0},
                {340.0, 340.0},
                {325.0, 325.0},
                {300.0, 300.0},
                {275.0, 275.0},
                {400.0, 400.0, 400.0},
                {350.0, 350.0, 350.0},
                {300.0, 300.0, 350.0},
                {300.0, 300.0, 250.0},
                {260.0, 260.0, 260.0},
                {350.0, 350.0},
                {340.0, 340.0},
                {325.0, 325.0},
                {300.0, 300.0},
                {275.0, 275.0},

        };

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            Seller seller = sellers.get(i); // Assuming same index for corresponding seller
            double[] amounts = userSellerAmounts[i];

            for (double amount : amounts) {
                EventTicket ticket = new EventTicket();
                ticket.setUser(user);
                ticket.setSeller(seller);
                ticket.setAmount(amount);
                ticket.setQuantity(1); // Set quantity to 1 as specified
                eventTickets.add(ticket);
            }
        }

        eventTicketRepository.saveAll(eventTickets);
}
}*/
