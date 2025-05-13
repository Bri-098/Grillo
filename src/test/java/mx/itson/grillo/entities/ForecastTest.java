/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.grillo.entities;

import java.util.Date;
import mx.itson.grillo.enums.WeatherStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author icesp
 */
public class ForecastTest {
    
    public ForecastTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    /**
     * Test of convertToFahrenheit method, of class Forecast.
     */
    @Test
    public void testConvertToFahrenheit() {
        System.out.println("convertToFahrenheit");
        double temp = 45;
        double expResult = 113;
        double result = Forecast.convertToFahrenheit(temp);
        assertEquals(expResult, result, 0.5);
    }
    
}
