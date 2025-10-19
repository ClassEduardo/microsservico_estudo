package com.example.microsservico_estudo.application.services;

import com.example.microsservico_estudo.application.exceptions.InvalidCredentialsException;
import com.example.microsservico_estudo.application.interfaces.ILoginUseCase;
import com.example.microsservico_estudo.domain.interfaces.ITokenService;
import com.example.microsservico_estudo.domain.model.AuthResult;
import com.example.microsservico_estudo.domain.ports.IAuthenticationPorts;

public class LoginUseCase implements ILoginUseCase {

    private final IAuthenticationPorts authenticationService;
    private final ITokenService tokenService;

    public LoginUseCase(IAuthenticationPorts authenticationService, ITokenService tokenService) {
        this.authenticationService = authenticationService;
        this.tokenService = tokenService;
    }

    @Override
    public AuthResult Execute(String username, String password) {
        if (!authenticationService.authentication(username, password)) {
            throw new InvalidCredentialsException("Credenciais inválidas!");
        }
        String token = tokenService.generateToken(username);
        return new AuthResult(token, "Bearer");
    }
}
