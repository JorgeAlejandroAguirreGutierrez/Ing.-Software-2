/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatrondecorator;

/**
 *
 * @author joaaguir
 */
public class Cafe implements Bebida {

    @Override
    public double costo() {
        return 2000;
    }

    @Override
    public String descripcion() {
        return "LAS BEBIDAS MAS RICAS DE COLOMBIA";
    }
    
}
