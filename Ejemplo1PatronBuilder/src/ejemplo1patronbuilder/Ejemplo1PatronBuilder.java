/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1patronbuilder;

/**
 *
 * @author joaaguir
 */
public class Ejemplo1PatronBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Builder builder = new Builder()
                .setMasa("MASA")
                .setTamaño("GRANDE");
        Pizza pizza = builder.build();
        System.out.println(pizza.toString());
    }
    
}
