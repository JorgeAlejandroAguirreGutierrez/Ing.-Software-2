/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronadapter2;

/**
 *
 * @author joaaguir
 */
public class EjemploPatronAdapter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaPagoExterno SistemaPagoExterno = new SistemaPagoExterno();
        SistemaPago sistemaPago = new AdaptadorSistemaPagoExterno(SistemaPagoExterno);
        sistemaPago.procesarPago();
    }
    
}
