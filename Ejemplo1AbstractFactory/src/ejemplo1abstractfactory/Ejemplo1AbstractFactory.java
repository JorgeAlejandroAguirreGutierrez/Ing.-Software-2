/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1abstractfactory;

/**
 *
 * @author joaaguir
 */
public class Ejemplo1AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fabrica fabrica = new FabricaWindows();
        Boton botonWindows = fabrica.crearBoton();
        CuadroTexto cuadroTextoWindows = fabrica.crearCuadroTexto();
        botonWindows.renderizar();
    }
    
}
