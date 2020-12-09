/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

public class Calculos {
    
    public double calcularTotal(int cant, double precioUnit){
        return cant * precioUnit;
    }
    
    public double calcularImpuesto(double subtotalSuma){
        return subtotalSuma * 0.15;
    }
    
    public double calcultarTotalPago(double subtotalSuma, double impuesto){
        return subtotalSuma + impuesto;
    }
    
}
