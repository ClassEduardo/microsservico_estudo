package com.example.microsservico_estudo.application.interfaces;

import com.example.microsservico_estudo.domain.model.AuthResult;

public interface ILoginUseCase {
    AuthResult Execute(String username, String password);
}
