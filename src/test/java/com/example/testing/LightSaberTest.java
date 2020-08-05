package com.example.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LightSaberTest {

    @Test
    public void testSetCharge(){
        LightSaber lightSaber = new LightSaber(12345);

        float expected = 70f;
        lightSaber.setCharge(70f);
        float actual = lightSaber.getCharge();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetCharge(){
        LightSaber lightSaber = new LightSaber(12345);

        float expected = 100;
        float actual = lightSaber.getCharge();

        assertEquals(expected,actual);
    }

    @Test
    public void testSetColor(){
        LightSaber lightSaber = new LightSaber(12345);

        String expected = "Blue";
        lightSaber.setColor("Blue");
        String actual = lightSaber.getColor();

        assertEquals(expected,actual);
    }

    @Test
    public void testSerial(){
        LightSaber lightSaber = new LightSaber(12345);

        float expected = 12345;
        float actual = lightSaber.getJediSerialNumber();

        assertEquals(expected,actual);
    }

    @Test
    public void testUse(){
        LightSaber lightSaber = new LightSaber(12345);

        float init = lightSaber.getCharge();
        float expected = init - ((10f / 60.0f) * 50);
        lightSaber.use(50);
        float actual = lightSaber.getCharge();

        assertEquals(expected,actual);
    }

    @Test
    public void testGetMins(){
        LightSaber lightSaber = new LightSaber(12345);

        float charge = lightSaber.getCharge();
        float expected = ((charge/10f)*30);
        float actual = lightSaber.getRemainingMinutes();

        assertEquals(expected,actual);
    }

    @Test
    public void testRecharge(){
        LightSaber lightSaber = new LightSaber(12345);

        lightSaber.use(100);
        lightSaber.recharge();
        float expected = 100f;
        float actual = lightSaber.getCharge();

        assertEquals(expected,actual);
    }
}
