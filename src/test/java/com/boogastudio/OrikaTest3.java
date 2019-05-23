package com.boogastudio;

import com.boogastudio.configuration.Orika;
import ma.glasnost.orika.MapperFacade;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class, Orika.class})
public class OrikaTest3 {

    @Autowired
    MapperFacade orikaBeanMapper;

    @Test
    public void testDateConversion(){
        Date now = new Date();
        orikaBeanMapper.map(now, LocalDate.class);
    }

    @Test
    public void testLongToBoolean(){
        Long value = 1L;
        orikaBeanMapper.map(value, Boolean.class);
    }
}
