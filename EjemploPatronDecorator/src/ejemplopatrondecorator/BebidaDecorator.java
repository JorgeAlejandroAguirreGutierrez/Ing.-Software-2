/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatrondecorator;

/**
 *
 * @author joaaguir
 */
public abstract class BebidaDecorator implements Bebida {
    private Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double costo() {
        return bebida.costo();
    }
    
    @Override
    public String descripcion() {
        return bebida.descripcion();
    }
}
