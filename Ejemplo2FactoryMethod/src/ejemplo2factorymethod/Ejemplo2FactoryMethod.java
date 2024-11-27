/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2factorymethod;

/**
 *
 * @author joaaguir
 */
public class Ejemplo2FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creadora creadora = new CreadoraNotificacionSMS();
        Notificacion notificacion = creadora.crearObjetoNotificacion();
        notificacion.enviar("MENSAJE");
    }
    
}
