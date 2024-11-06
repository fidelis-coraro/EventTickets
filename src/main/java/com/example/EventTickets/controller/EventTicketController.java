package com.example.EventTickets.controller;

import com.example.EventTickets.model.Seller;
import com.example.EventTickets.model.User;
import com.example.EventTickets.service.EventTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/event-tickets")
public class EventTicketController {
    @Autowired
    private EventTicketService service;

    // Endpoint to get total amount sold by each seller
    @GetMapping("/total-amount-by-seller")
    public List<Object[]> getTotalAmountSoldByEachSeller() {
        return service.getTotalAmountSoldByEachSeller();
    }

    // Endpoint to get top 10 sellers by total amount sold
    @GetMapping("/top-10-sellers")
    public List<Object[]> getTop10SellersByTotalAmountSold() {
        return service.getTop10SellersByTotalAmountSold();
    }

    @GetMapping("/sellers-by-name")
    public List<Seller> getSellersByNamePrefix(@RequestParam String prefix) {
        return service.getSellersStartingWith(prefix);
    }

    // Endpoint to get high volume buyers who bought more than a specified amount
    @GetMapping("/high-volume-buyers")
    public List<Object[]> getHighVolumeBuyers(@RequestParam double threshold) {
        return service.getHighVolumeBuyers(threshold);
    }

    // Endpoint to get top 10 buyers by total amount bought
    @GetMapping("/top-10-buyers")
    public List<Object[]> getTop10Buyers() {
        return service.getTop10Buyers();
    }

    // Endpoint to retrieve users whose names start with a specific prefix
    @GetMapping("/users-by-name")
    public List<User> getUsersByNamePrefix(@RequestParam String prefix) {
        return service.getUsersStartingWith(prefix);
    }
}

