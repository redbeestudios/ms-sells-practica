package com.redbee.mssellspractica.config.properties.model;

import lombok.Data;

@Data
public class RedisProperties {
    private String host;
    private String port;
    private String password;
}
