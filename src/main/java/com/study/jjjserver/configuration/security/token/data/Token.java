package com.study.jjjserver.configuration.security.token.data;

public record Token(
        String grantType,
        String accessToken,
        String refreshToken
) {
}
