package sion.test.prototype.shopping;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShoppingController {
    private final ShoppingService shoppingService;

    @GetMapping("/shopping/list")
    public List<Shopping> getShoppingList() {
        return null;
    }
}
