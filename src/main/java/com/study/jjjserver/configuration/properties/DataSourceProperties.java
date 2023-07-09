package com.study.jjjserver.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource")
public record DataSourceProperties(
        String url,
        String username,
        String password,
        String driverClassName
) {
}
