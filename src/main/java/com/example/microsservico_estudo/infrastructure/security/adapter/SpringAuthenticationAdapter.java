package com.example.microsservico_estudo.infrastructure.security.adapter;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import com.example.microsservico_estudo.domain.interfaces.IAuthenticationService;


public class SpringAuthenticationAdapter implements IAuthenticationService {
    private final AuthenticationManager authenticationManager;

    public SpringAuthenticationAdapter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public boolean authentication(String username, String password) {
        try {
            Authentication auth = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
            );

            return auth.isAuthenticated();
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
