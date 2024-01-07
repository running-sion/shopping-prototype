package sion.test.prototype.cancel;

import jakarta.persistence.*;
import sion.test.prototype.user.User;

import java.time.LocalDateTime;

@Entity
public class Cancel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cancel_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private Long orderId; // TODO CHECK 어떤 주문건에 대한 취소인지에 대한 정보가 넘어오는가?
    private String productName;
    private Integer quantity;
    private Integer totalPrice;
    private LocalDateTime canceledAt;
    private LocalDateTime createdAt;
}
