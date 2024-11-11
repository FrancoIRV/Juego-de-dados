package com.Dom;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;


import static org.junit.jupiter.api.Assertions.*;
class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(5, calculadora.sumar(2,3));
    }

    @Test
    void testCompararNumeroGanador() {
        assertTrue(calculadora.compararNumero(7));
    }

    @Test
    void testCompararNumeroPerdedor(){
        assertFalse(calculadora.compararNumero(5));
    }
}