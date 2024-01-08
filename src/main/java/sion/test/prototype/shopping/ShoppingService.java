package sion.test.prototype.shopping;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingService {
    private final ShoppingRepository repository;
}
