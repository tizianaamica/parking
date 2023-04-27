package com.nelumbo.challenge.domain.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.OffsetDateTime;

import static org.modelmapper.convention.MatchingStrategies.STRICT;

@Configuration
public class ChallengeConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.createTypeMap(String.class, OffsetDateTime.class);
        modelMapper.createTypeMap(OffsetDateTime.class, String.class);
        modelMapper.getConfiguration().setMatchingStrategy(STRICT);
        return modelMapper;
    }

}
