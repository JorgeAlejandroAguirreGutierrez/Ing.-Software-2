/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author joaaguir
 */
public class FabricaMac implements Fabrica{

    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoMac();
    }
    
}
