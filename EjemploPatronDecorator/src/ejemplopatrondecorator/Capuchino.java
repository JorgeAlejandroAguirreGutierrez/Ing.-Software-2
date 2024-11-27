/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatrondecorator;

/**
 *
 * @author joaaguir
 */
public class Capuchino extends BebidaDecorator {

    public Capuchino(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double costo() {
        return super.costo() + 3000;
    }
    
    
}
