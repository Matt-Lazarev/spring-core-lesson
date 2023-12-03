package com.lazarev.springcorelesson.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;

@Component
public class ClientRepository {
    private final Connection connection;

    @Autowired
    public ClientRepository(Connection connection) {
        this.connection = connection;
    }
}
