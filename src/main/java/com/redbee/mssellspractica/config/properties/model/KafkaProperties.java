package com.redbee.mssellspractica.config.properties.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaProperties {
    private String bootstrapServers;
    private TopicProperties topic;
}
