/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author joaaguir
 */
public class EjemploPatronBridge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlataformaMensaje correo = new CorreoElectronico();
        Mensaje mensajeUrgente = new MensajeUrgente(correo);
        mensajeUrgente.enviarMensaje("HOLA MUNDO");
    }
    
}
