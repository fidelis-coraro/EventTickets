package com.example.EventTickets.repository;

import com.example.EventTickets.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Method to find users by name starting with a given prefix
    List<User> findByNameStartingWith(String prefix);
}
