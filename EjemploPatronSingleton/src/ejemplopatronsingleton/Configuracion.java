/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopatronsingleton;

/**
 *
 * @author joaaguir
 */
public class Configuracion {
    private static Configuracion instancia;
    
    private String url;
    private String usuario;
    private String password;
    
    private Configuracion(String url, String usuario, String password){
        this.url = url;
        this.usuario = usuario;
        this.password = password;
    }
    
    public static Configuracion getInstancia(String url, String usuario, String password){
        if(instancia == null){
            instancia = new Configuracion(url, usuario, password);
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }  
    
}
