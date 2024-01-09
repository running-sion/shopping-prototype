package sion.test.prototype.shopping;

import jakarta.persistence.*;
import sion.test.prototype.user.User;

import java.time.LocalDateTime;

@Entity
public class Shopping {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopping_id")
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    private String type; // TODO Enum - ORDER, CANCEL
    private String productName;
    private Integer totalPrice;
    private Integer quantity;
    private LocalDateTime createdAt; // 구매 혹은 취소일자
}
