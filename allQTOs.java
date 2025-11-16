package com.ecommerce.dto;

import lombok.Data;

@Data
public class RegisterDto {
    private String name;
    private String email;
    private String password;
}
@Data
public class LoginDto {
    private String email;
    private String password;
}
@Data
public class AuthResponse {
    private String token;
    private String email;
}
@Data
public class OrderItemDto {
    private Long productId;
    private int qty;
}