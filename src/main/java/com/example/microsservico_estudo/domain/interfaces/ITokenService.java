package com.example.microsservico_estudo.domain.interfaces;

public interface ITokenService {
    String generateToken(String username);
    String extractUsername(String token);
    boolean validateToken(String token, String username);
}
