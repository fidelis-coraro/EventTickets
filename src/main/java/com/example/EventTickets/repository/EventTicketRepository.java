package com.example.EventTickets.repository;

import com.example.EventTickets.model.EventTicket;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventTicketRepository extends JpaRepository<EventTicket, Long> {

    // Get total amount sold by each seller
    @Query("SELECT e.seller.id, SUM(e.amount) FROM EventTicket e GROUP BY e.seller.id")
    List<Object[]> getTotalAmountSoldByEachSeller();

    // Get top 10 sellers by total amount sold
    @Query("SELECT e.seller.id, SUM(e.amount) AS totalAmount FROM EventTicket e GROUP BY e.seller.id ORDER BY totalAmount DESC")
    List<Object[]> getTop10SellersByTotalAmountSold(Pageable pageable);

    // Query to get high volume buyers (users who bought more than a certain amount)
    @Query("SELECT e.user.id, SUM(e.amount) AS totalAmount " +
            "FROM EventTicket e " +
            "GROUP BY e.user.id " +
            "HAVING SUM(e.amount) > :threshold " +
            "ORDER BY totalAmount DESC")
    List<Object[]> getHighVolumeBuyers(double threshold);

    // Query to get the top 10 buyers by total amount bought
    @Query("SELECT e.user.id, SUM(e.amount) AS totalAmount " +
            "FROM EventTicket e " +
            "GROUP BY e.user.id " +
            "ORDER BY totalAmount DESC")
    List<Object[]> getTop10Buyers(Pageable pageable);
}
