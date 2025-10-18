package com.example.microsservico_estudo.application.services;

import com.example.microsservico_estudo.application.InvalidCredentialsException;
import com.example.microsservico_estudo.application.interfaces.ILoginUseCase;
import com.example.microsservico_estudo.domain.interfaces.IAuthenticationService;
import com.example.microsservico_estudo.domain.interfaces.ITokenService;
import com.example.microsservico_estudo.domain.model.AuthResult;

public class LoginUseCase implements ILoginUseCase {

    private final IAuthenticationService authenticationService;
    private final ITokenService tokenService;

    public LoginUseCase(IAuthenticationService authenticationService, ITokenService tokenService) {
        this.authenticationService = authenticationService;
        this.tokenService = tokenService;
    }

    public AuthResult Execute(String username, String password) {
        if (!authenticationService.authentication(username, password)) {
            throw new InvalidCredentialsException("Credenciais inválidas!");
        }
        String token = tokenService.generateToken(username);
        return new AuthResult(token, "Bearer");
    }
}
