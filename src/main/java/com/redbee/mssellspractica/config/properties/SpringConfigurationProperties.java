package com.redbee.mssellspractica.config.properties;

import com.redbee.mssellspractica.config.properties.model.KafkaProperties;
import com.redbee.mssellspractica.config.properties.model.RedisProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SpringConfigurationProperties {
    private KafkaProperties kafka;
    private RedisProperties redis;
}
