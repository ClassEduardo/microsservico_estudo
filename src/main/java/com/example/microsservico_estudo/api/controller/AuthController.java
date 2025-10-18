package com.example.microsservico_estudo.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microsservico_estudo.api.dto.AuthRequest;
import com.example.microsservico_estudo.api.dto.AuthResponse;
import com.example.microsservico_estudo.application.interfaces.ILoginUseCase;
import com.example.microsservico_estudo.domain.model.AuthResult;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final ILoginUseCase loginUseCase;

    public AuthController(ILoginUseCase loginUseCase) {
        this.loginUseCase = loginUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<?> Login(@RequestBody AuthRequest request) {
        try {
            AuthResult result = loginUseCase.Execute(
                    request.getUsername(),
                    request.getPassword()
            );

            AuthResponse response = new AuthResponse(
                    result.getToken(),
                    result.getTokenType()
            );

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.status(401).body(e.getMessage());
        }
    }
}
