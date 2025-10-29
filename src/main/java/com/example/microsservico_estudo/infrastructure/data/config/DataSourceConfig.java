package com.example.microsservico_estudo.infrastructure.data.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
    @Value("$spring.datasource.url")
    String urlBase;

    @Value("$spring.datasource.username")
    String username;

    @Value("$spring.datasource.password")
    String password;

    @Value("$spring.datasource.driver-class-name")
    String driverName;

    @Bean
    public DataSource createConnection() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(urlBase);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}
