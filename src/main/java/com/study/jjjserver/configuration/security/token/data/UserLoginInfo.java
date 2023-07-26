package com.study.jjjserver.configuration.security.token.data;

public record UserLoginInfo(
        String username,
        String userPassword
) {
}
