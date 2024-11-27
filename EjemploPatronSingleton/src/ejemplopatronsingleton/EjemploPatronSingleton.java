/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopatronsingleton;

/**
 *
 * @author joaaguir
 */
public class EjemploPatronSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuracion configuracion  = Configuracion.getInstancia("localhost:5432", "root", "root");
        System.out.println(configuracion.getUrl());
        
        Configuracion otraConfiguracion = Configuracion.getInstancia("localhost:5432", "root", "root");
    }
    
}
