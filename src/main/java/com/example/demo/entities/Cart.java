package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="carts")
@Getter
@Setter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    public Long id;

    @Setter
    @Column(name="order_tracking_number")
    public String orderTrackingNumber;

    @Column(name = "package_price")
    public BigDecimal package_price;

    @Column(name = "party_size")
    public int party_size;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusType status = StatusType.pending;

    @Column(name = "create_date")
    @CreationTimestamp
    public Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    public Date last_update;

    @ManyToOne
    @JoinColumn(name="customer_id")
    public Customer customer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cart")
    public Set<CartItem> cartItems;

    public void add(CartItem item) {
        if (item != null) {
            if (cartItems == null) {
                cartItems = new HashSet<>();
            }
            cartItems.add(item);
            item.setCart(this);
        }
    }

}
