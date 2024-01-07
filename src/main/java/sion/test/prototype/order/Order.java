package sion.test.prototype.order;

import jakarta.persistence.*;
import sion.test.prototype.user.User;

import java.time.LocalDateTime;

@Entity
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private String productName;
    private Integer quantity;
    private Integer totalPrice;
    private LocalDateTime orderedAt;
    private LocalDateTime createdAt;

}
