package com.example.escola.shared;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigModel {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
