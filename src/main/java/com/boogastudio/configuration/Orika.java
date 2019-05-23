package com.boogastudio.configuration;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Orika {

    @Bean
    public MapperFacade orikaBeanMapper() {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();


        ConverterFactory converterFactory = mapperFactory.getConverterFactory();

        converterFactory.registerConverter(new OrikaDateConverter());
        converterFactory.registerConverter(new OrikaLongToBooleanConverter());


        MapperFacade mapper = mapperFactory.getMapperFacade();
        return mapper;
    }

}
