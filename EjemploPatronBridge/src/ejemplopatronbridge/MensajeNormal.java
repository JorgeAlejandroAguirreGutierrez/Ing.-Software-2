/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author joaaguir
 */
public class MensajeNormal extends Mensaje {

    public MensajeNormal(PlataformaMensaje plataformaMensaje) {
        super(plataformaMensaje);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        //LOGICA AÑADIDA
        plataformaMensaje.enviarMensaje(mensaje);
    }
    
}
