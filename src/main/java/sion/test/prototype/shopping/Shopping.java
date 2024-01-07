package sion.test.prototype.shopping;

import lombok.Getter;
import lombok.Setter;
import sion.test.prototype.cancel.Cancel;
import sion.test.prototype.order.Order;

@Getter
@Setter
public class Shopping {
    private String type; // TODO Enum - ORDER, CANCEL
    private String productName;
    private Order order;
    private Cancel cancel;
}
