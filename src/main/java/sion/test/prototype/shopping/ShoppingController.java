package sion.test.prototype.shopping;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ShoppingController {
    private final ShoppingService shoppingService;

    @GetMapping("/shopping/list/{id}")
    @ResponseBody
    public List<Shopping> getShoppingList(@PathVariable("id") Long userId) {
        List<Shopping> list = shoppingService.findAllByUser(userId);
        return list;
    }
}
