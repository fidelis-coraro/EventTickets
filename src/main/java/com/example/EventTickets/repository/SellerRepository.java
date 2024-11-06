package com.example.EventTickets.repository;

import com.example.EventTickets.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  SellerRepository extends JpaRepository<Seller, Long> {
    List<Seller> findByNameStartingWith(String prefix);
}
