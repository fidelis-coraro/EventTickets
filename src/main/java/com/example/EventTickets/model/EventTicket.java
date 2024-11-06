package com.example.EventTickets.model;


import jakarta.persistence.*;

@Entity
@Table(name = "event_tickets")
public class EventTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventTicketId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "seller_id", nullable = false)
    private Seller seller;

    private Double amount;
    private Integer quantity;

    // Getters and setters
    public Long getEventTicketId() { return eventTicketId; }
    public void setEventTicketId(Long eventTicketId) { this.eventTicketId = eventTicketId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Seller getSeller() { return seller; }
    public void setSeller(Seller seller) { this.seller = seller; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
}
