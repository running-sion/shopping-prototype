package sion.test.prototype.shopping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ShoppingController {
    @GetMapping("/shopping/list")
    public List<Shopping> getShoppingList() {
        // TODO order, cancel join
        return null;
    }
}
