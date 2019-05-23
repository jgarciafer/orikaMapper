package com.boogastudio;

import com.boogastudio.configuration.OrikaDateConverter;
import com.boogastudio.configuration.OrikaLongToBooleanConverter;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.ConverterFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrikaTest2 {

    @Test
    public void name() {
        Person person = new Person();
        person.setName(new Name("Jonatan","Garcia"));
        person.setBirthDate(new Date());
        List<Name> knownAliases = new ArrayList<>();
        person.setKnownAliases(knownAliases);
        person.setDateOfWedding(new Date());
        person.setMarried(1L);

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        ConverterFactory converterFactory = mapperFactory.getConverterFactory();

        converterFactory.registerConverter(new OrikaDateConverter());
        converterFactory.registerConverter(new OrikaLongToBooleanConverter());


        mapperFactory.classMap(Person.class, PersonDto.class)
                .field("name.first", "firstName")
                .field("name.last", "lastName")
                .field("knownAliases{first}", "aliases{[0]}")
                .field("knownAliases{last}", "aliases{[1]}")
                .field("birthDate","dateMarried")
                .byDefault()
                .register();

        MapperFacade mapper = mapperFactory.getMapperFacade();
        PersonDto personDto = mapper.map(person, PersonDto.class);

        System.out.println(personDto);
    }


}
