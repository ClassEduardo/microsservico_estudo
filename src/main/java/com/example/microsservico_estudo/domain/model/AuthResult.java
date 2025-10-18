package com.example.microsservico_estudo.domain.model;

public class AuthResult {
    private String token;
    private String tokenType;
    
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
