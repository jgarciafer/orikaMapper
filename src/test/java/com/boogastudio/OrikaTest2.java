package com.boogastudio;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
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

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Person.class, PersonDto.class)
                .field("name.first", "firstName")
                .field("name.last", "lastName")
                .field("knownAliases{first}", "aliases{[0]}")
                .field("knownAliases{last}", "aliases{[1]}")
                .byDefault()
                .register();

        MapperFacade mapper = mapperFactory.getMapperFacade();
        PersonDto personDto = mapper.map(person, PersonDto.class);

        System.out.println(personDto);
    }


}
