/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author joaaguir
 */
public class FabricaWindows implements Fabrica {

    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public CuadroTexto crearCuadroTexto() {
        return new CuadroTextoWindows();
    }
    
}
