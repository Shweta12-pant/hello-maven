package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void addReturnsSum() {
        assertEquals(12, new App().add(5, 7));
    }

    @Test
    void addHandlesNegatives() {
        assertEquals(-1, new App().add(2, -3));
    }
}