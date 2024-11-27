/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronadapter2;

/**
 *
 * @author joaaguir
 */
public class AdaptadorSistemaPagoExterno implements SistemaPago {

    private SistemaPagoExterno sistemaPagoExterno;
    
    public AdaptadorSistemaPagoExterno(SistemaPagoExterno sistemaPagoExterno){
        this.sistemaPagoExterno = sistemaPagoExterno;
    }
    
    @Override
    public void procesarPago() {
        sistemaPagoExterno.autorizarTransaccion();
        sistemaPagoExterno.realizarPago();
    }
}
