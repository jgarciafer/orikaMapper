package com.boogastudio;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class OrikaTest {

    MapperFactory mapperFactory;

    //CustomMapper<Personne3, Person3> customMapper;

    @Before
    public void before() {
        mapperFactory = new DefaultMapperFactory.Builder().build();
    }

    @Test
    public void givenSrcAndDest_whenMaps_thenCorrect() {
        mapperFactory.classMap(Source.class, Dest.class);
        MapperFacade mapper = mapperFactory.getMapperFacade();
        Source src = new Source("Baeldung", 10);
        Dest dest = mapper.map(src, Dest.class);
        assertEquals(dest.getAge(), src.getAge());
        assertEquals(dest.getName(), src.getName());
    }



}
