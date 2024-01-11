package sion.test.prototype.shopping;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingRepository extends JpaRepository<Shopping, Long> {
    List<Shopping> findByUserId(Long userId, Pageable pageable);
}
