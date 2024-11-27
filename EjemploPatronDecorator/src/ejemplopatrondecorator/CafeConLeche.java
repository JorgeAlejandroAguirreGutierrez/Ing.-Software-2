/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatrondecorator;

/**
 *
 * @author joaaguir
 */
public class CafeConLeche extends BebidaDecorator {
    
    public CafeConLeche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double costo() {
        return super.costo() + 2000;
    }
    
    
    
}
