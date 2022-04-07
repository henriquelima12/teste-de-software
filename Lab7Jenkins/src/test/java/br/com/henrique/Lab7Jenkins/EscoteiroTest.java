package br.com.henrique.Lab7Jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class EscoteiroTest {
    
    public EscoteiroTest() {
    }

    Escoteiro escoteiro = new Escoteiro();

    @Test
    public void testSubsidioSocio() {
        assertEquals(25, escoteiro.getSubsidioSocio(1));
        assertEquals(35, escoteiro.getSubsidioSocio(2));
        assertEquals(50, escoteiro.getSubsidioSocio(3));
    }
    
    @Test
    public void testSubsidioPosto() {
        assertEquals(10, escoteiro.getSubsidioPosto("LOBO"));
        assertEquals(15, escoteiro.getSubsidioPosto("URSO"));
        assertEquals(20, escoteiro.getSubsidioPosto("LEÃO"));
        assertEquals(0, escoteiro.getSubsidioPosto("LOBINHO"));
    }
    
}
