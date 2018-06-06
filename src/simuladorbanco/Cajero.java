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
public class Cajero {
    
    private String nombre;
    
    public String getNombre(){
        return nombre;
        
    }

    // Constructor, getter y setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cajero(String nombre) {
    }

	public void tipoTransaccion(Cliente cliente, long timeStamp) {

		System.out.println("El cajero " + this.nombre + 
				" COMIENZA A PROCESAR LA TRANSACCION DEL CLIENTE " + cliente.getNombre() + 
				" EN EL TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000	+
				"seg");

		for (int i = 0; i < cliente.getTipoTransaccion().length; i++) { 
				this.esperarXsegundos(cliente.getTipoTransaccion()[i]); 
				System.out.println("Procesada la Transaccion " + (i + 1) +  
				" ->Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + 
				"seg");
		}

		System.out.println("La cajera " + this.nombre + " HA TERMINADO DE PROCESAR " + 
				cliente.getNombre() + " EN EL TIEMPO: " + 
				(System.currentTimeMillis() - timeStamp) / 1000 + "seg");

	}


	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    
}
