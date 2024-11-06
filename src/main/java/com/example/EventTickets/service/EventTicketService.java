package com.example.EventTickets.service;

import com.example.EventTickets.model.Seller;
import com.example.EventTickets.model.User;
import com.example.EventTickets.repository.EventTicketRepository;
import com.example.EventTickets.repository.SellerRepository;
import com.example.EventTickets.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventTicketService {
    @Autowired
    private EventTicketRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Autowired
    private UserRepository userRepository;

    // Get total amount sold by each seller
    public List<Object[]> getTotalAmountSoldByEachSeller() {
        return repository.getTotalAmountSoldByEachSeller();
    }

    // Get top 10 sellers by total amount sold
    public List<Object[]> getTop10SellersByTotalAmountSold() {
        return repository.getTop10SellersByTotalAmountSold(PageRequest.of(0, 10));
    }

    // Retrieve sellers whose names start with "ra"
    public List<Seller> getSellersStartingWith(String prefix) {
        return sellerRepository.findByNameStartingWith(prefix);
    }

    // Get high volume buyers based on a minimum threshold amount
    public List<Object[]> getHighVolumeBuyers(double threshold) {
        return repository.getHighVolumeBuyers(threshold);
    }

    // Get top 10 buyers by total amount bought
    public List<Object[]> getTop10Buyers() {
        return repository.getTop10Buyers(PageRequest.of(0, 10));
    }

    // Retrieve users whose names start with a specified prefix
    public List<User> getUsersStartingWith(String prefix) {
        return userRepository.findByNameStartingWith(prefix);
    }
}

