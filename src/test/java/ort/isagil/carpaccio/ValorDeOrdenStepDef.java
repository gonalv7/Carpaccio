/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.isagil.carpaccio;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author alumnoFI
 */
public class ValorDeOrdenStepDef {
    private int cantidad;
    private int precio;
    private int total;
    
    @Dado("^la cantidad de item (\\d+) y el precio del item (\\d+)$")
    public void dadasLasMonedas(int unCantidad,
                                int unPrecio) throws Throwable {
        
        cantidad = unCantidad;
        precio = unPrecio;
    }
    
    @Cuando("^calculo el total$")
    public void sumarMonedas() throws Throwable {        
        total = cantidad * precio;
    }
    
    @Entonces("^el resultado es (\\d+)$")
    public void elResultadoEs(int unTotal) throws Throwable {
        assertEquals(unTotal, total);
    }
}
