package com.back2261.authservice.domain.service;

import com.back2261.authservice.interfaces.request.RegisterRequest;
import com.back2261.authservice.interfaces.response.RegisterResponse;

public interface AuthService {
    RegisterResponse register(RegisterRequest registerRequest);
}