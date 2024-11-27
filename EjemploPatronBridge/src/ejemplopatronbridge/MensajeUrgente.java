/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronbridge;

/**
 *
 * @author joaaguir
 */
public class MensajeUrgente extends Mensaje {

    public MensajeUrgente(PlataformaMensaje plataformaMensaje) {
        super(plataformaMensaje);
    }
    
    //METODOS ADICIONALES

    @Override
    public void enviarMensaje(String mensaje) {
        //LOGICA ADICIONAL
        //METODOS ADICIONALES
        plataformaMensaje.enviarMensaje(mensaje);
    }
    
}
