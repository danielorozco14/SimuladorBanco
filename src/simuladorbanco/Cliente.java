/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorbanco;

/**
 *
 * @author Daniel Alejandro Orozco Orellana <00200617@uca.edu.sv>
 */
public class Cliente {
    
    private String nombre;
    private int [] tipoTransaccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(int[] tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
      
    
    public Cliente(String nombre, int[] transaccion){
        setNombre(nombre);
        setTipoTransaccion(transaccion);
    }
}
