package sion.test.prototype.shopping;

import lombok.Getter;
import lombok.Setter;
import sion.test.prototype.cancel.Cancel;
import sion.test.prototype.order.Order;

import java.time.LocalDateTime;

@Getter
@Setter
public class Shopping {
    private String type; // TODO Enum - ORDER, CANCEL
    private Long userId;
    private String productName;
    private Integer totalPrice;
    private Integer quantity;
    private LocalDateTime createdAt; // 구매 혹은 취소일자
}
