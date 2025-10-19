package com.example.microsservico_estudo.domain.ports;

public interface IAuthenticationPorts {
    boolean authentication(String username, String password);
}
