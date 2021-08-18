package com.example.demo.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {


    Car car;
    @Before
    public void setUp(){
        car = new Car();
    }

    @Test
    public void getId() {
        long idValue=25L;
        car.setId(idValue);
        assertEquals(idValue, car.getId());

    }
}