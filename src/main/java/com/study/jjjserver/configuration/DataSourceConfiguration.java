package com.study.jjjserver.configuration;

import com.study.jjjserver.configuration.properties.DataSourceProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
public class DataSourceConfiguration {
    private final DataSourceProperties dataSourceProperties;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceProperties.driverClassName());
        dataSource.setUrl(dataSourceProperties.url());
        dataSource.setUsername(dataSourceProperties.username());
        dataSource.setPassword(dataSourceProperties.password());
        return dataSource;
    }
}
