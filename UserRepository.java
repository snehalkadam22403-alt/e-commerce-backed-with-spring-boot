package com.ecommerce.repos;

import com.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
public interface ProductRepository extends JpaRepository<Product, Long> {}
public interface OrderRepository extends JpaRepository<Order, Long> {}
