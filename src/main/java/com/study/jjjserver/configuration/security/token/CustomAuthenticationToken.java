package com.study.jjjserver.configuration.security.token;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class CustomAuthenticationToken extends AbstractAuthenticationToken {
    public CustomAuthenticationToken() {
        super(null); //
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}