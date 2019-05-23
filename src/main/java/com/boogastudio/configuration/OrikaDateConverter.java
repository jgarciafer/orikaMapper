package com.boogastudio.configuration;

import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.metadata.Type;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class OrikaDateConverter extends BidirectionalConverter<Date,LocalDate> {

    @Override
    public LocalDate convertTo(Date source, Type<LocalDate> destinationType, MappingContext mappingContext) {
        //return source.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Instant instant = Instant.ofEpochMilli(source.getTime());
        LocalDate res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
        return res;
    }

    @Override
    public Date convertFrom(LocalDate source, Type<Date> destinationType, MappingContext mappingContext) {
        Instant instant = source.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date res = Date.from(instant);
        return res;

    }

}
