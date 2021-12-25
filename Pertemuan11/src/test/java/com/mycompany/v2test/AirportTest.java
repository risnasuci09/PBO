/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.v2test;

/**
 *
 * @author hp
 */

import com.mycompany.v2.*;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class AirportTest {
    private Flight economyFlight, businessFlight;
    
    @Before   
    public void setUp() {
        economyFlight = new EconomyFlight("1");
        businessFlight = new BusinessFlight("2");
    }
    
    @org.junit.Test
    public void testEconomyFlightRegularPassenger() {
        Passenger mike = new Passenger("Mike", false);
        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(mike));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("Mike", economyFlight.getPassengersList().get(0).getName());
        assertEquals(true, economyFlight.removePassenger(mike));
        assertEquals(0, economyFlight.getPassengersList().size());
    }   
    
    @org.junit.Test
    public void testEconomyFlightVipPassenger() {
        Passenger james = new Passenger("James", true);
        assertEquals("1", economyFlight.getId());
        assertEquals(true, economyFlight.addPassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
        assertEquals("James", economyFlight.getPassengersList().get(0).getName());
        assertEquals(false, economyFlight.removePassenger(james));
        assertEquals(1, economyFlight.getPassengersList().size());
    }
    
    @org.junit.Test
    public void testBusinessFlightRegularPassenger() {
        Passenger mike = new Passenger("Mike", false);
        assertEquals(false, businessFlight.addPassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(mike));
        assertEquals(0, businessFlight.getPassengersList().size());
    }
    
    @org.junit.Test
    public void testBusinessFlightVipPassenger() {
        Passenger james = new Passenger("James", true);
        assertEquals(true, businessFlight.addPassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
        assertEquals(false, businessFlight.removePassenger(james));
        assertEquals(1, businessFlight.getPassengersList().size());
    }
}
