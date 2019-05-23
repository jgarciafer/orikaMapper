package com.boogastudio.configuration;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class OrikaLongToBooleanConverter extends BidirectionalConverter<Long,Boolean> {

    @Override
    public Boolean convertTo(Long source, Type<Boolean> destinationType, MappingContext mappingContext) {
        return source.equals(1L);
    }

    @Override
    public Long convertFrom(Boolean source, Type<Long> destinationType, MappingContext mappingContext) {
        return source.equals(true)?1L:0L;
    }

}
