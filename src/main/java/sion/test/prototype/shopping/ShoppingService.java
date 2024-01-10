package sion.test.prototype.shopping;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShoppingService {
    private final ShoppingRepository repository;

    public List<Shopping> findAllByUser(Long userId) {
        return repository.findByUserId(userId);
    }
}
