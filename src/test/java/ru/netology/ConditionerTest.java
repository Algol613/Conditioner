package ru.netology;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ConditionerTest {

    @Test
    public void setCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        conditioner.setMaxTemperature(28);
        conditioner.setCurrentTemperature(22);
        int expected = 22;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMaxTmperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(28);
        int expected = 28;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMinTmperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        int expected = 15;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotExceedMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(30);
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldNotExceedMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(10);
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(28);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(17);
        conditioner.decreaseCurrentTemperature();
        int expected = 16;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}