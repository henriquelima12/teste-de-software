package com.mack.lab6testesunitarios;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChassiTest {
    
    public ChassiTest() {
    }
    
    Chassi chassi = new Chassi("9BP17164GA0000001");

    @Test
    public void testChassiCompleto() {
        chassi.setNumero("9BP17164GA0000001");
        assertEquals("Completo", chassi.incompleto());
        assertNotEquals("Inválido tamanho menor", chassi.incompleto());
        assertNotEquals("Inválido tamanho maior", chassi.incompleto());
    }
    
    @Test
    public void testChassiTamanhoMenor() {
        chassi.setNumero("9BP17164GA000000");
        assertEquals("Inválido tamanho menor", chassi.incompleto());
        assertNotEquals("Completo", chassi.incompleto());
        assertNotEquals("Inválido tamanho maior", chassi.incompleto());
    }
    
    @Test
    public void testChassiTamanhoMaior() {
        chassi.setNumero("9BP17164GA00000012");
        assertEquals("Inválido tamanho maior", chassi.incompleto());
        assertNotEquals("Completo", chassi.incompleto());
        assertNotEquals("Inválido tamanho menor", chassi.incompleto());
    }
    
    @Test
    public void testAno10() {
        chassi.setNumero("9BP17164GA0000001");
        assertEquals(10, chassi.getAno());
        assertNotEquals(11, chassi.getAno());
        assertNotEquals(12, chassi.getAno());
        assertNotEquals(-1, chassi.getAno());
    }
    
    @Test
    public void testAno11() {
        chassi.setNumero("9BP17164GB0000001");
        assertEquals(11, chassi.getAno());
        assertNotEquals(10, chassi.getAno());
        assertNotEquals(12, chassi.getAno());
        assertNotEquals(-1, chassi.getAno());
    }
    
    @Test
    public void testAno12() {
        chassi.setNumero("9BP17164GC0000001");
        assertEquals(12, chassi.getAno());
        assertNotEquals(10, chassi.getAno());
        assertNotEquals(11, chassi.getAno());
        assertNotEquals(-1, chassi.getAno());
    }
    
    @Test
    public void testAnoDefault() {
        chassi.setNumero("9BP17164GD0000001");
        assertEquals(-1, chassi.getAno());
        assertNotEquals(10, chassi.getAno());
        assertNotEquals(11, chassi.getAno());
        assertNotEquals(12, chassi.getAno());
    }
    
    @Test
    public void testGetNumero() {
        chassi.maiusculo();
        assertEquals("9BP17164GA0000001", chassi.getNumero());
        assertNotEquals("9bp17164ga0000001", chassi.getNumero());
    }
        
}
