package com.example.microsservico_estudo.domain.model;

public class AuthResult {
    private final String token;
    private final String tokenType;
    
    public AuthResult(String token, String tokenType) {
        this.token = token;
        this.tokenType = tokenType;
    }

    public String getToken() {
        return token;
    }

    public String getTokenType() {
        return tokenType;
    }
}
